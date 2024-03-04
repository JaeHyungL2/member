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
    public String save(@RequestParam("Email") String Email,
                       @RequestParam("Password") String Password,
                       //각각의 파라미터@param("값을") -> String email 같이 스트링변수로 받아서
                       //컨트롤러 -> 서비스 클래스로 넘겨주고,-> 레포지토리로넘겨주고-> 데이터베이스로 넘기는
                       //그래야 나의 웹페이지, 중 회원가입에서 사용자가 입력한 회원정보가 db로 저장된다!
                       @RequestParam("Name") String Name) {
        System.out.println("MemberController.save()");
        System.out.println("email"+Email+", pass"+Password+ ",Name"+Name);
        return "index";
    }
    //자, 이제 여기서 회원가입 전 몇가지 세팅좀해보자..
    //서비스와 컨트롤러와 ㅋ 그디어나오네.. 5개 패키지,  회원게시판, 쇼핑몰 에서 관리하기좋음..ㅋ
}
