package com.example.app.service;

import com.example.app.entity.Post;
import com.example.app.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PostServiceImpl implements PostService{


    @Autowired
   private PostRepository postrepo;

    @Override
    public List<Post> createPost(Post post) {
       Post pt= this.postrepo.save(post);
       return this.postrepo.findAll();
    }
}
