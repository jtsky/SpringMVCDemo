package com.jin.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("mvc")
public class MainController {

    /**
     * 登陆页面
     *
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    /**
     * 注册页面
     *
     * @return
     */
    @RequestMapping(value = "/register.do", method = RequestMethod.GET)
    public String register() {
        return "login";
    }

    /**
     * 后台主页
     *
     * @return
     */
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = "/listActionLog", method = RequestMethod.GET)
    public String hello() {
        return "list_action_log";
    }
}
