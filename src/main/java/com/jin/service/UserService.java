package com.jin.service;

import com.jin.domain.User;

public interface UserService extends BaseService<User> {
    int add(User user) throws Exception;

    User findUser(User user);
}
