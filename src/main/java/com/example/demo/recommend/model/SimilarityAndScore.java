package com.example.demo.recommend.model;

import lombok.Data;
import org.hibernate.event.internal.DefaultSaveOrUpdateEventListener;

/**
 * @author 黄腾
 * @Date 2018/1/2-19:18
 * @function
 */
@Data
public class SimilarityAndScore {
    private double similarity;
    private  Integer score;
}
