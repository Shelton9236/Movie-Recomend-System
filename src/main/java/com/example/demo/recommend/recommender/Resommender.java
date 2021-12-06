package com.example.demo.recommend.recommender;

import com.example.demo.recommend.predictor.Predictor;
import com.example.demo.recommend.similarityCalutor.SimilarityCalculator;

/**
 * @author 黄腾
 * @Date 2017/12/29-20:21
 * @function
 */
public interface Resommender {
    public  void setSimilarityCalutor(SimilarityCalculator similarityCalutor);
    public void setPredictor(Predictor predictor);
    public  void recommend();

}
