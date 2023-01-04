package com.example.app.controller;


import com.example.app.entity.Post;
import com.example.app.service.PostService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Posts")
public class MyController {

    @Autowired
    PostService service;

    @PostMapping("/pa")
    public ResponseEntity<List<Post>>createPosts(@Valid @RequestBody Post post){
      List<Post>postList= service.createPost(post);
        return new ResponseEntity<List<Post>>(postList, HttpStatus.CREATED);
    }

}
