package com.example.springTest2.controller;


import com.example.springTest2.pojo.LoginInfo;
import com.example.springTest2.domain.service.UserService;
import com.example.springTest2.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/user/{id}")
    public Users getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }



    @PostMapping("/apiLogin")
    public Map login(@RequestBody LoginInfo loginInfo) {

        Users user = userService.getUserByNameAndPassword(loginInfo);
        Map<String, Object> map = new HashMap<>();
        map.put("code", "0");
        if (user == null) {
            map.put("msg", "username or password is not correct");
        } else {
            map.put("msg", "login successfully");
        }

        return map;
    }

}
