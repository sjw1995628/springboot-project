package com.jwson.www.springboot.web;

import com.jwson.www.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//JSON을 반환하는 컨트롤러, Responsebody와 유사 // http요청의 바디내용으로 자바객체를 클라로 전송
@RestController
public class HelloController {
   //get을 처리하는 mapping
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name , @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }

}
