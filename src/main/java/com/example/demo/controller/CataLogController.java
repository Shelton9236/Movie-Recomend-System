package com.example.demo.controller;

import com.example.demo.model.CataLog;
import com.example.demo.respository.CataLogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import java.util.List;

/**
 * @author 黄腾
 * @Date 2017/12/24-16:06
 * @function
 */
public class CataLogController {

    @Autowired
    private CataLogRepository cataLogRepository;


}
