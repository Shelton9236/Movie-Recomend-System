package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author 黄腾
 * @Date 2017/12/26-11:15
 * @function
 */
@Data
@Entity
public class RatingItem {
    @Id @Column(name="ratingItem_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer rating;
    private String comment;
    private Date commentDate;
    @OneToOne
    @JoinColumn(name = "movie_id")
    private  Movie movie;
    @OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    private User user;
}
