package com.codingrecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //가장먼저!가장기본페이지요청시 메소드호출하게끔해놔야함.ㅋ.
    @GetMapping("/")
    //이렇게까지해놔야 뜨는군.ㅋ
    public String index() {
        return "index";
    }
}
