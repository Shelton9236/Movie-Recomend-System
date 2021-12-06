package com.example.demo.service;

import com.example.demo.model.Movie;

import java.util.List;

/**
 * @author 黄腾
 * @Date 2018/1/2-14:34
 * @function
 */
public interface ITagRecommendService {
    public List<Movie> recommend(Integer userId);
}
