package com.example.demo.respository;

import com.example.demo.model.Country;
import com.example.demo.model.Movie;
import org.springframework.data.repository.CrudRepository;

/**
 * @author 黄腾
 * @Date 2017/12/15-13:36
 * @function
 */
public interface CountryRepository  extends CrudRepository<Country,Integer> {
}
