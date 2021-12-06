package com.example.demo.model;

import lombok.Data;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.*;

/**
 * @author 黄腾
 * @Date 2017/12/15-17:35
 * @function
 */
@Data
@Entity
public class User {
    @Id @Column(name ="user_id")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Integer id;
    private  String  name;
   // private  String email;
    private  Boolean firstLogin=true;
    private  String password;
}
