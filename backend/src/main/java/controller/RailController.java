package com.railops.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.railops.service.RailService;

@RestController
@RequestMapping("/api")
public class RailController {
    private final RailService railService;

    @Autowired
    public RailController(RailService railService) {
        this.railService = railService;
    }

    @GetMapping
    public String check(){
        return railService.str();
    }

}
