package com.jin.domain;

import java.io.Serializable;

/***
 创建数据库用户表：
 CREATE TABLE `user` (
 `login_id` varchar(20) NOT NULL COMMENT '登陆ID',
 `pwd` varchar(20) NOT NULL COMMENT '用户密码',
 `name` varchar(100) NOT NULL COMMENT '用户姓名',
 `age` int(3) NOT NULL COMMENT '用户年龄',
 `sex` varchar(3) NOT NULL COMMENT '性别',
 `duty` varchar(15) COMMENT '职务',
 `cell_number` varchar(15) COMMENT '手机号',
 `photo_url` varchar(75) COMMENT '头像地址',
 `used` boolean NOT NULL COMMENT '账号是否可用',
 PRIMARY KEY (`login_id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='用户表';

 插入默认数据：
 INSERT INTO `user` (`login_id`,`pwd`,`name`,`age`,`sex`,`used`)
 VALUES
 ('pc859107393','123456','阿程',20,'男',true),
 ('pc228568859','123456','chengcheng',20,'女',true),
 ('pangpang','123456','余下一整夜',25,'男',true),
 ('111111','123456','手拉手系列教程',22,'女',true);
 */

//推荐大家把每个bean对应的数据库操作备注到上面。
//打开Navicat For Mysql，链接上数据库，创建对应的数据库，并运行上面的sql产生数据库表和初始记录。

/**
 * 用户
 */
public class User implements Serializable {
    private String name;    //名字
    private String sex; //性别
    private String loginId; //登陆ID
    private String pwd;    //密码
    private String duty;    //职务
    private int age;    //年龄
    private String cellNumber;  //手机号
    private String photoUrl;    //头像地址
    private boolean used = true;   //是否可用,默认值是true

    private String nextUrl; //下一步的的操作地址

    public String getNextUrl() {
        return nextUrl;
    }

    public void setNextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", loginId='" + loginId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", duty='" + duty + '\'' +
                ", age=" + age +
                ", cellNumber='" + cellNumber + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", used=" + used +
                '}';
    }
}

