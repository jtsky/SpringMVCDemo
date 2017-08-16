package com.jin.domain;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by 程 on 2016/10/28.
 * ===============>sql创建数据库<===============
 * CREATE TABLE `user_action_log` (
 * `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
 * `login_id` varchar(20) DEFAULT NULL COMMENT '登录ID',
 * `session_id` varchar(45) NOT NULL COMMENT '访问session的ID\r\n',
 * `time` datetime DEFAULT NULL COMMENT '操作时间',
 * `ip_addr_v4` varchar(15) DEFAULT NULL COMMENT 'ipV4地址',
 * `ip_addr_v6` varchar(128) DEFAULT NULL COMMENT 'ipv6地址\r\n',
 * `os_name` varchar(20) DEFAULT NULL COMMENT '操作系统名称',
 * `os_version` varchar(20) DEFAULT NULL,
 * `bro_name` varchar(20) DEFAULT NULL COMMENT '浏览器名称',
 * `bro_version` varchar(20) DEFAULT NULL COMMENT '浏览器版本',
 * `request_body` varchar(60) DEFAULT NULL COMMENT '请求体信息',
 * `description` varchar(100) DEFAULT NULL COMMENT '操作描述',
 * `other` varchar(150) DEFAULT NULL,
 * `method` varchar(10) DEFAULT NULL COMMENT 'HTTP请求方法',
 * PRIMARY KEY (`id`)
 * ) ENGINE=InnoDB AUTO_INCREMENT=109 DEFAULT CHARSET=utf8 COMMENT='行为日志表';
 */
public class UserActionLog implements Serializable {

    private long id;
    private String loginId, sessionId, ipAddrV4, ipAddrV6, osName, osVersion, broName, broVersion, requestBody, description, other, method;
    private Date time;

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getIpAddrV4() {
        return ipAddrV4;
    }

    public void setIpAddrV4(String ipAddrV4) {
        this.ipAddrV4 = ipAddrV4;
    }

    public String getIpAddrV6() {
        return ipAddrV6;
    }

    public void setIpAddrV6(String ipAddrV6) {
        this.ipAddrV6 = ipAddrV6;
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getBroName() {
        return broName;
    }

    public void setBroName(String broName) {
        this.broName = broName;
    }

    public String getBroVersion() {
        return broVersion;
    }

    public void setBroVersion(String broVersion) {
        this.broVersion = broVersion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "UserActionLog{" +
                "id=" + id +
                ", loginId='" + loginId + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", ipAddrV4='" + ipAddrV4 + '\'' +
                ", ipAddrV6='" + ipAddrV6 + '\'' +
                ", osName='" + osName + '\'' +
                ", osVersion='" + osVersion + '\'' +
                ", broName='" + broName + '\'' +
                ", broVersion='" + broVersion + '\'' +
                ", requestBody='" + requestBody + '\'' +
                ", description='" + description + '\'' +
                ", other='" + other + '\'' +
                ", method='" + method + '\'' +
                ", time=" + time +
                '}';
    }
}
