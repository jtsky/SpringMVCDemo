package com.jin.exception;

/**
 * Created by Administrator on 2016/9/25.
 */
public class UserCanNotBeNullException extends NullPointerException {
    public UserCanNotBeNullException(String message) {
        super(message);
    }

}
