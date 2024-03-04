package com.codingrecipe.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//스프링 빈으로 등록시켜주기위해 (객체지..컨테이너가 관리하도록, 우린 주입만받기위해 ㅋ)
@Controller
public class MemberController {
    @GetMapping("/jh/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/jh/save")
    public String save(@RequestParam("Email") String Email) {
        System.out.println("MemberController.save()");
        System.out.println("memberEmail=" + Email);
        return "index";
    }
}
