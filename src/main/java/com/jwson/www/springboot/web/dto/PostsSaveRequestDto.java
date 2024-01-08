package com.jwson.www.springboot.web.dto;

import com.jwson.www.springboot.domain.posts.Posts;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

    private String title;
    private String content;
    private String author;
    //등록?
    @Builder
    public PostsSaveRequestDto(String title, String content,String author){
        this.title=title;
        this.content=content;
        this.author=author;
    }
    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
