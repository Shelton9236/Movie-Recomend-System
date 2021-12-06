package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 黄腾
 * @Date 2017/12/15-14:26
 * @function
 */
@Data
@Entity
public class CataLog {
    @Id  @Column(name = "catalog_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String name;
}
