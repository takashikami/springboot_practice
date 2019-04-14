/* -*- tab-width:4 -*-
   Created on 2019-04-14 by kami
 */

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class DemoController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<Map<String, Object>> getFavorits() {
        List<Map<String, Object>> fruits;
        fruits = jdbcTemplate.queryForList("select * from favorites");
        return fruits;
    }
}
