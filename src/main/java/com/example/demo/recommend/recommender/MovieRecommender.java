package com.example.demo.recommend.recommender;

import com.example.demo.recommend.model.Similarity;
import com.example.demo.recommend.predictor.Predictor;
import com.example.demo.recommend.similarityCalutor.SimilarityCalculator;

/**
 * @author 黄腾
 * @Date 2017/12/29-20:24
 * @function
 */
public class MovieRecommender implements Resommender {
    private SimilarityCalculator similarityCalculator;
    private Predictor predictor;


    @Override
    public void setSimilarityCalutor(SimilarityCalculator similarityCalutor) {
        this.similarityCalculator=similarityCalutor;
    }

    @Override
    public void setPredictor(Predictor predictor) {
        this.predictor=predictor;
    }

    @Override
    public void recommend() {
    }
}
