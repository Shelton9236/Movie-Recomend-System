package com.example.demo.respository;


import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by Administrator on 2017/5/12.
 */

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {

    public User findByNameAndPassword(String name, String password);
    public User findByName(String name);

}
