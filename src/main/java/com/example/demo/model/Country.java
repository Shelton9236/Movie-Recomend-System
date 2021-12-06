package com.example.demo.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

/**
 * @author 黄腾
 * @Date 2017/12/15-13:23
 * @function
 */
@Data
@Entity
public class Country {
    @Id @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id;
    private  String  name;
}
