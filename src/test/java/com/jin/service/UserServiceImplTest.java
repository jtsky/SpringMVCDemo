package com.jin.service;

import com.jin.BaseTest;
import com.jin.domain.User;
import com.jin.service.serviceImpl.UserServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImplTest extends BaseTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void testAdd() {
        User user = new User();
        try {
            user.setDuty("duty");
            user.setAge(17);
            user.setLoginId("pc6666666");
            user.setName("jj");
            user.setPwd("6666666");
            user.setSex("男");
            user.setCellNumber("18258153647");
            user.setPhotoUrl("http://wwww.baidu.com");
            user.setUsed(true);
            userService.add(user);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
