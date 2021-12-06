package com.example.demo.recommend.respository;



import java.util.List;
import java.util.Map;

/**
 * @author 黄腾
 * @Date 2017/12/28-13:42
 * @function
 */
public interface AvgRatingRespository {
    //根据用户的id获取其平均分
    public Double findByUserId(Integer userId);
    public void deleteAll();
    public Map<Integer,Double> findAvgRatingMapByUserIdList(List<Integer> userIdlist);
    public void generateAll();
}
