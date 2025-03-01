package com.example.spring.posts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PostsController {

    // 게시글 등록 (화면, GET)
    @RequestMapping(value = "/posts/create", method = RequestMethod.GET)
    public String create() {
        return "posts/create";
    }
}
