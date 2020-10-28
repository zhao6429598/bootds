package com.itqf.carboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * projectName: carboot
 *
 * @author: 赵伟风
 * time: 2020/10/28 0:50
 * description:
 */

@RestController
public class IndexController {

     @GetMapping("/index")
     public Map<String,String> retIndex(){

         Map<String,String> map = new HashMap<>();
         map.put("name", "llili");

         return map;
     }


}
