package com.codingrecipe.member.controller;

import org.springframework.web.bind.annotation.GetMapping;

//스프링 빈으로 등록시켜주기위해 (객체지..컨테이너가 관리하도록, 우린 주입만받기위해 ㅋ)
public class MemberController {
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }
}
