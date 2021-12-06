package com.example.demo.recommend.similarityCalutor;

import com.example.demo.recommend.model.Similarity;

import java.util.Set;

/**
 * @author 黄腾
 * @Date 2017/12/29-16:48
 * @function
 */
public interface SimilarityCalculator{
    public Set<Similarity> calutorsSimilarity();
}
