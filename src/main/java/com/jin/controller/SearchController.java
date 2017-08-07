package com.jin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jin
 */

@Controller
public class SearchController {
    private Logger log = Logger.getLogger(SearchController.class);

    @RequestMapping(value = "/search")
    @ResponseBody
    public Object searchAll(HttpServletRequest request, HttpServletResponse response, Model model) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "sss");
        map.put("age", 27);
        log.info("request====>" + request.getMethod());
        return map;
    }
}
