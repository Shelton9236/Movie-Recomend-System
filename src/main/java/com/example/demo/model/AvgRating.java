package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

/**
 * @author 黄腾
 * @Date 2018/1/2-17:18
 * @function
 */
@Entity
@Data
@Table(name ="avgrating")
public class AvgRating {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public  Integer id;
    @Column(name ="usrid")
    public  Integer userId;
    @Column(name = "avgRating")
    public  Integer avgRating;
}
