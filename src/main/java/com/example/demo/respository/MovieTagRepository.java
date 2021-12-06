package com.example.demo.respository;

import com.example.demo.model.MoiveTag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

/**
 * @author 黄腾
 * @Date 2018/1/1-17:25
 * @function
 */
public interface MovieTagRepository extends JpaRepository<MoiveTag,Integer> {
    public List<MoiveTag> findByMovieId(Integer movieId);
    public MoiveTag findByMovieIdAndTagId(Integer movieId,Integer tagId);
    public void deleteAllByMovieId(Integer movieId);
    public Page<MoiveTag> findByTagId(Integer tagId, Pageable pageable);
}
