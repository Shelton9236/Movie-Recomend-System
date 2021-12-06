package com.example.demo.recommend.respository;

import com.example.demo.recommend.model.RatingItem;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 黄腾
 * @Date 2017/12/29-17:14
 * @function
 */
public  interface UserRatingMapperDao {
    //从用户评分类表当中获取对物品i和物品j都有过评分的用户评分字典
    //返回数据格式为嵌套的Map.格式为{用户id:{物品id:分数项目}}
    //{userId：{itemId:RatingItem}}
    public Map<Integer,Map<Integer,RatingItem>> getCommonUserItemsUserRatingsMap(Integer itemi,Integer itemj);
    //从评分列表当中获取需要计算的物品的id列表。
    public Set<Integer> getItemSet();
    public Map<Integer,Map<Integer,RatingItem>> getUserRatingMapperByItemSet(Set<Integer> itemSet);

}
