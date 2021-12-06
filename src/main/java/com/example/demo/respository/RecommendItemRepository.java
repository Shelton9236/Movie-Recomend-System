package com.example.demo.respository;

import com.example.demo.model.RecomItem;
import com.example.demo.recommend.model.RatingItem;
import com.example.demo.recommend.model.RecommendItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 黄腾
 * @Date 2018/1/2-17:32
 * @function
 */

public interface RecommendItemRepository extends JpaRepository<RecomItem,Integer>{
   // public  Page<RecomItem>  findByUserIdAndOrderByRecdgDesc(Integer userId, Pageable pageable);
}
