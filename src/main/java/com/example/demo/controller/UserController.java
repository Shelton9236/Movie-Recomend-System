package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.respository.MovieRepository;
import com.example.demo.respository.MovieTagRepository;
import com.example.demo.respository.TagRepository;
import com.example.demo.respository.UserTagRespository;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.soap.SOAPBinding;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Size;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author 黄腾
 * @Date 2018/1/2-11:34
 * @function
 */
@Controller
@RequestMapping("/user")
public class UserController  {

    @Autowired
    private UserTagRespository userTagRespository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieTagRepository movieTagRepository;
    @Autowired
    private TagRepository tagRepository;
    @PostMapping(value = "/chooseTag")
    public ModelAndView  saveChooseTag(String[] tags, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        User user=(User) session.getAttribute("user");
        Integer userId= user.getId();
        if (tags != null) {
            for (String tag : tags) {
                System.out.println(tag);
                UserTag userTag=new UserTag();
                userTag.setName(tag);
                userTag.setUserId(userId);
                userTagRespository.save(userTag);
            }
        }
        modelAndView.setViewName("forward:/?userId="+user.getId());
        return  modelAndView;
    }



}
