package com.example.springbootproject.controller;

import com.example.springbootproject.entity.Desk;
import com.example.springbootproject.model.DeskDTO;
import com.example.springbootproject.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class DeskController {
    @Autowired
    DeskService deskService;

    @PostMapping(value= "add", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    private Desk addDesk(@RequestBody DeskDTO desk){
        return deskService.create(desk);
    }

}
