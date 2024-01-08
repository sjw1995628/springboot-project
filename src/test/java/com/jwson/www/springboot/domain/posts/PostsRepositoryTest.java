package com.jwson.www.springboot.domain.posts;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    // 단위 테스트 끝나면 수행되는 메소드 // 테스트간 데이터 침법 방지
    // 여러 테스트 동시 수행시 데이터가 남을 수 있다.
    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }
    @Test
    public void 게시글_불러오기() {
        //given
        String title = "테스트 게시글";
        String content= "테스트 본문";

        //테이블 posts에 insert/update 수행 ,, 값이 있으면 update 없으면 insert
        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("hi@gmail.com")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);

    }
}
