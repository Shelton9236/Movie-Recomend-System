package com.example.demo.respository;

import com.example.demo.model.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author 黄腾
 * @Date 2017/12/31-21:54
 * @function
 */
public interface TagRepository extends JpaRepository<Tag,Integer>{
    public Tag findByName(String name);

}
