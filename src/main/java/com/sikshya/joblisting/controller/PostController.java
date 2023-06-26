package com.sikshya.joblisting.controller;


import com.sikshya.joblisting.model.Post;
import com.sikshya.joblisting.repository.PostRepository;
import com.sikshya.joblisting.repository.SearchRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    PostRepository postRepository;

    @Autowired
    SearchRepositoryImpl searchRepository;

    @GetMapping("/posts")
    public List<Post> getPosts(){
        return postRepository.findAll();
    }

    @GetMapping("/posts/{text}")
    public List<Post> search(@PathVariable String text){
        return searchRepository.findByText(text);
    }

    @PostMapping("/post")
    public Post savePost(@RequestBody Post post){
        return postRepository.save(post);
    }
}
