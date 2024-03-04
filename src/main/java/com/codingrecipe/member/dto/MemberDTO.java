package com.codingrecipe.member.dto;


//DTO는 롬복, 즉 데이터관리에 필요한게 게터세터이니, 이것만 해주면되고,  다 정해져있음..ㅋ 나머진 꾸미기..

import lombok.*;

@Getter  //롬복 라이브러리는 어노테이션만붙여주면, 게터세터 안만들어도되도록 단축시킴 ㅋ
@Setter
@NoArgsConstructor  //기본생성자를 자동으로 만들어줌.ㅋ
@AllArgsConstructor //이건필드를 모두 다 매개변수로하는생성자를 만듬 ㅋ
@ToString  //dto객체가 가지는 필드값 출력시, To-> String메소드로 출력하는군. 아..dto도 클래스니까 틀이라 객체만들수있네 참..ㅋ
//dto클래스는 흠.., 회원정보에 필요한 내용들..(입력받을) 필드로 정리해둔 거라고보면됨 ㅋ 거의 장볼때 비닐봉지 ㅋ 정도로보면됨 ㅋ 잠깐쓰되필요는 하는..ㅋㅋ
//  필드는 private로 감추곤함..그래서 세터,게터메소드가 필요하게됨.. 간접적으로 접근하기위해.ㅋ   (
public class MemberDTO {
    private Long id;
    private String Email;
    private String Password;
    private String Name;

}
//이정도면됨 ㅋ 비닐봉다리는 ㅋ 거의고정이라 이정도면 왠만한 소통엔 문제없어짐..