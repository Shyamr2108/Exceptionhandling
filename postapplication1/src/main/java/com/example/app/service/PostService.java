package com.example.app.service;

import com.example.app.entity.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PostService {


    public List<Post> createPost(Post post);


}
