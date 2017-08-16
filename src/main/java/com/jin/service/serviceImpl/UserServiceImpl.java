package com.jin.service.serviceImpl;

import com.jin.dao.UserDao;
import com.jin.domain.User;
import com.jin.exception.UserCanNotBeNullException;
import com.jin.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//创建UserServiceImpl实现UserService接口
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public int add(User user) throws Exception {
        if (null == user)
            throw new UserCanNotBeNullException("User can not be Null");

        if (StringUtils.isEmpty(user.getLoginId()))
            throw new NullPointerException("user loginId can not be null");

        if (StringUtils.isEmpty(user.getPwd()))
            throw new NullPointerException("user password can not be null");

        //由于我这个是仓库管理系统，根据业务需求来说，我们的用户基本信息都是不能为空的
        //基本信息包括：姓名、年龄、用户名、密码、性别、手机号，年龄大于18
        if (StringUtils.isEmpty(user.getSex())
                || user.getAge() > 120
                || StringUtils.isEmpty(user.getCellNumber())) {
            //其他综合异常
            throw new NullPointerException("Some use's base info can not be null");
        }
        //已经存在相同用户
        if (null != userDao.findOneById(user.getLoginId())) {
            //存在相同的用户异常
            throw new NullPointerException("Register User Failed，Because the  user Aiready exist");
        }
        int result = 0; //受影响的行数默认为0
        try {
            result = userDao.add(user);
        } catch (Exception e) {
            System.out.println("添加用户失败,用户已经存在");
            //其他用户添加失败异常
            throw new Exception(e);
        }
        if (result > 0)
            System.out.println("添加用户成功");

        return result;
    }


    public User findUser(User user) {
        if (null == user)
            throw new UserCanNotBeNullException("User can not be Null");

        User result = userDao.findOneById(user.getLoginId());
        return result;
    }

}
