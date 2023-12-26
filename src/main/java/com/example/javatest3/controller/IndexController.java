/*
 * Copyright 2023 NHN (https://nhn.com) and others.
 * © NHN Corp. All rights reserved.
 */

package com.example.javatest3.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class IndexController {

    @GetMapping("/index")
    public String index() {
        return "hello k8s!";
    }

    @GetMapping("/")
    public String index2() {
        log.info("[time: ]fluent bit 테스트용 접속 로깅", LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME));

        return "hello K8s 제발가자!!!!!!!!";
    }
}