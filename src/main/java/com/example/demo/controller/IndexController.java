package com.example.demo.controller;

import com.example.demo.model.CataLog;
import com.example.demo.model.Movie;
import com.example.demo.respository.CataLogRepository;
import com.example.demo.respository.MovieRepository;
import com.example.demo.service.ITagRecommendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import java.util.List;

/**
 * @author 黄腾
 * @Date 2017/12/24-15:13
 * @function
 */
@Controller
public class IndexController {


    @Autowired
    private CataLogRepository cataLogRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private ITagRecommendService iTagRecommendService;
    @RequestMapping("/")
    public ModelAndView init(@RequestParam(required = false) Integer userId,
                             @RequestParam(required = false,defaultValue ="1") Integer cataLogId,
                             @RequestParam(required = false,defaultValue = "false") Boolean asyn){
                ModelAndView modelAndView=new ModelAndView();
                modelAndView.setViewName("index");
                //初始化类别表
                List<CataLog> cataLogList= cataLogRepository.findAll();
                modelAndView.addObject("cataLogList",cataLogList);
                CataLog cataLog=cataLogRepository.findOne(cataLogId);
                Pageable pageable=new PageRequest(0,2);
                //初始化按照类别查询的movie字段
                Page<Movie> pageBean=movieRepository.findByCataLog(cataLog,pageable);
                modelAndView.addObject("cataLogPageBean",pageBean);
                modelAndView.setViewName("index");
                modelAndView.addObject("movieListByCatalog",pageBean);
                System.out.println("页数"+pageBean.getTotalPages()+"当前页数"+(pageBean.getNumber()+1));

                if(asyn=Boolean.TRUE){
                    System.out.println("asyn=True");
                }
                List<Movie> recommendMovieByTagList=null;
                if(userId!=null){
                    System.out.println("index"+userId);
                   recommendMovieByTagList= iTagRecommendService.recommend(userId);
                    System.out.println(userId);
                    System.out.println(recommendMovieByTagList);
                    modelAndView.addObject("recommendMovieListByTag",recommendMovieByTagList);
                }
                return  modelAndView;
    }

}
