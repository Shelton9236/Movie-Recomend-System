package com.example.demo.model;

import lombok.Data;
import org.codehaus.groovy.transform.GroovyASTTransformation;

import javax.persistence.*;

/**
 * @author 黄腾
 * @Date 2017/12/2-17:10
 * @function
 */
@Entity
@Data
@Table(name = "recom")
public class RecomItem{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Integer id;
    @Column(name = "uid")
    private   Integer userId;
    @Column(name="mid")
    private Integer moiveid;
    @Column(name = "reasonids")
    private String recommendReasonIds;
    private  Double recdg;
}
