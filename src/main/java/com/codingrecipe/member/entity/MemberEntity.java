package com.codingrecipe.member.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity  //클래스,서비스,엔티티 각 패키지에맞게 어노테이션붙여주자..ㅋ
@Setter
@Getter
@Table(name="member_table") //테이블어노테이션은  디비에 실제 이 클래스정의대로 테이블생성되는데 그렇게만들어주는역할.
        //실제 테이블 디비에만들어지면 테이블이름이됨.ㅋ
public class MemberEntity {

    //자, 테이블정의시 pk 기본키가있지?
    @Id //어노테이션을써줌
    @GeneratedValue(strategy = GenerationType.IDENTITY) //mysql에서의 오토인크리먼트,ㅋ

    private Long id;
    @Column(unique = true) //그다음 일반컬럼, + 유니크 제약조건추가
    private String Mail;

    @Column
    private String Password;

    @Column
    private String Name;

    //이런 컬럼, 필드를 갖는 테이블이 만들어짐..ㅋ 아...


    //엔티티라는 클래스가 참.. 현재 스프링데이터 jpa
    //엔티티클래스가 DB의 테이블 역할을 함..
    //테이블, 자바클래스, 메소드를 이용해서 Query쿼리를 쓰고 전송해서 테이블과 crud작업을하지..
    //but 스프링데이터JPA는 <DB의 테이블>을 일종의 <자바객체>처럼 활용할 수 있도록 접근함..
}

//엔티티클래스에의해 이렇게 만들어졌다..