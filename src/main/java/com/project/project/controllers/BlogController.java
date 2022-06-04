package com.project.project.controllers;

import com.project.project.models.Post;
import com.project.project.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BlogController {

    @Autowired
    private PostRepository postRepository;

    @GetMapping("/blogMain")
    public String blogMain (Model model){
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts", posts);
        return "blogMain";
    }

    @GetMapping("/blogMain/blogAdd")
    public String blogAdd (Model model){

        return "blogAdd";
    }

}

