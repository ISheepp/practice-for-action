package com.example.practiceaction.controller;

import com.example.practiceaction.domain.TestModel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public ResponseEntity<TestModel> test() {
        return ResponseEntity.ok(new TestModel("white", 80.0, "jack"));
    }

}
