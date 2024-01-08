package com.jwson.www.springboot.domain.posts;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
//NoArgsContstructor = public Posts(){}
@NoArgsConstructor
//테이블과 링크될 클래스를 나타낼 떄 Posts를 씀
@Entity
public class Posts {
    @Id // pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) //pk 생성규칙 . GenerationType.IDENTITY 는 auto increment
    private Long id;
    //기본적으로 칼럼을 쓰지 않아도, 해당 클래스 필드는 칼럼이 되지만,
    //기본값외에 추가르 원하는 경우. Column 어노테이션을 이용한다.
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;
    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
    public void update(String title, String content){
        this.title=title;
        this.content=content;
    }
}

