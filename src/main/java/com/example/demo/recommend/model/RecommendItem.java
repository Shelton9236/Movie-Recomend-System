package com.example.demo.recommend.model;

/**
 * @author 黄腾
 * @Date 2017/12/30-12:39
 * @function
 */
public class RecommendItem {
    private   int recommendItemId;
    private  double predictorRating;

    public String getReacommendReasonIds() {
        return reacommendReasonIds;
    }

    public void setReacommendReasonIds(String reacommendReasonIds) {
        this.reacommendReasonIds = reacommendReasonIds;
    }

    private  String  reacommendReasonIds;

    public RecommendItem() {
    }

    public int getRecommendItemId() {
        return recommendItemId;
    }

    public void setRecommendItemId(int recommendItemId) {
        this.recommendItemId = recommendItemId;
    }

    public double getPredictorRating() {
        return predictorRating;
    }

    public void setPredictorRating(double predictorRating) {
        this.predictorRating = predictorRating;
    }
}
