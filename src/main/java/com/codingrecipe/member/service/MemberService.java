package com.codingrecipe.member.service;


import com.codingrecipe.member.dto.MemberDTO;
import com.codingrecipe.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;

@Service //어노테이션붙여줘서 스프링이 관리하는 객체인 빈으로 등록시켜주고~!. ㅋ  조아..  컨트롤러도 안붙이니 스프링이 관리안해서 따로놀더라..
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        //우리가 호출했던방식으로
    }
}
