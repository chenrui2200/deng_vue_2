/*
 * Copyright (c) 2021 NCIT Corporation
 *
 * 製造会社: NCIT Corporation
 */

package com.example.springTest2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class HelloController {
    private final AtomicInteger visitCount = new AtomicInteger(0);
    @GetMapping("/hello")
    public String hello() {

        int count = visitCount.incrementAndGet();
        return "Hello, this is your visit number: " + count;
    }
}