package com.jin.controller;

import com.jin.bean.Bean1;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jin
 */

@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);

    @RequestMapping(path = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Object getUser(HttpServletRequest request, HttpServletResponse response, Model model) {
        Bean1 bean1 = new Bean1();
        bean1.setName("jin");
        bean1.setPhone("saa");
        log.info(bean1);
        return bean1;
    }
}
