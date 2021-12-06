package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author 黄腾
 * @Date 2017/12/31-12:55
 * @function
 */
@Entity
@Data
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;     //标签id
    private  String name;//记录标签名字
    private Integer count;//记录拥有此标签的电影数量
}
