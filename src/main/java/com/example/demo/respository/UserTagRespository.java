package com.example.demo.respository;

import com.example.demo.model.UserTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 黄腾
 * @Date 2018/1/2-12:17
 * @function
 */
public interface UserTagRespository extends JpaRepository<UserTag,Integer> {
    public List<UserTag> findByUserId(Integer userid);

}
