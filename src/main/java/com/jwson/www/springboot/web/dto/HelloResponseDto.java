package com.jwson.www.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Getter
@RequiredArgsConstructor
// final필드를 포함한 생성자 생성하는 어노테이션
public class HelloResponseDto {
    private final String name;
    private final int amount;
}


