package com.example.spring.posts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostsController {

    // 게시글 등록 (화면, GET)
    @GetMapping("/posts/create")
    public String create() {
        return "posts/create";
    }
}
