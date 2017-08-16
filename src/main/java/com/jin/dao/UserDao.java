package com.jin.dao;

import com.jin.domain.User;

import java.io.Serializable;
import java.util.List;

public interface UserDao extends Dao<User> {

    int add(User t);

    int del(User t);

    int update(User t);

    User findOneById(Serializable Id);

    List<User> findAll();

    void updateLoginSession(String id);

    void addSessionId(String id);
}
