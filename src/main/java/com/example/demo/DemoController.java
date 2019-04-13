/* -*- tab-width:4 -*-
   Created on 2019-04-14 by kami
 */

package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/")
public class DemoController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public List<String> getFavoriteFruits() {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.addAll(Arrays.asList("りんご","なし","すもも","いちご","オレンジ"));
        return fruits;
    }
}
