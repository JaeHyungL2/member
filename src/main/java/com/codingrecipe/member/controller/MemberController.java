package com.codingrecipe.member.controller;

import com.codingrecipe.member.dto.MemberDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

//스프링 빈으로 등록시켜주기위해 (객체지..컨테이너가 관리하도록, 우린 주입만받기위해 ㅋ)
@Controller
public class MemberController {
    @GetMapping("/jh/save")
    public String saveForm() {
        return "save";
    }

    //두번째 모델 어트리뷰트! Model model ,   attribute() 이거쓴단거군..ㅋㅋ
    @PostMapping("/jh/save")
    public String save(MemberDTO memberDTO) {  //아~~ 이렇게하면 dto에 name변수값이 잘 담겨서
        System.out.println("memberDTO = " + memberDTO);
        return "index";
    }
    //자, 이제 여기서 회원가입 전 몇가지 세팅좀해보자..
    //서비스와 컨트롤러와 ㅋ 그디어나오네.. 5개 패키지,  회원게시판, 쇼핑몰 에서 관리하기좋음..ㅋ

    //이렇게 가능한게 중간에 우리가 매개변수로 dto클래스 타입으로 정해주면, 스프링이  html(뷰)의 name속성과 = dto 필드가 동일하다면,
        //알아서 스프링이 dto객체만들어서 객체의 Setter메소드를 각각 호출하면서 , name에 작성된 값을 -> dto 비닐봉지에 담아줌 ㅋ

}
