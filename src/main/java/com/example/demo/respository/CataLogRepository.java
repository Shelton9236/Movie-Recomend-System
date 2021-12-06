package com.example.demo.respository;

import com.example.demo.model.CataLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 黄腾
 * @Date 2017/12/15-14:43
 * @function
 */
public interface CataLogRepository extends JpaRepository<CataLog,Integer> {
}
