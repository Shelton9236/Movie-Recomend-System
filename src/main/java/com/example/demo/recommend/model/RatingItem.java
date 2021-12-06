package com.example.demo.recommend.model;

import lombok.Data;

/**
 * @author 黄腾
 * @Date 2017/12/27-22:44
 * @function
 */
@Data
public class RatingItem {
    private Integer itemId;
    private Integer userId;
    private  Integer rating;
}
