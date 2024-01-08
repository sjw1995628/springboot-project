package com.jwson.www.springboot.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;


//DAO (Data Access Object. DBlayer 접근자, 보통 Interface는 <EntityClass,PKType> 이런식으로 상속
//Zenity Entity Repository 같은 위치에 있어야 됨 // 그래서 도메인별로 묶어서 관리함
public interface PostsRepository extends JpaRepository<Posts,Long>{

}
