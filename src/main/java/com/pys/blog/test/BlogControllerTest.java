package com.pys.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 특정 어노테이션이 붙어있는 클래스파일을 new해서 스프링컨테이너가 관리함. @Controller는 관리대상임.
*/
@RestController
public class BlogControllerTest {
	
	//http://localhost:8080/test/hello
	@GetMapping("/test/hello")
	public String hello() {
		return "<h1> hello spring boot </h1>";
	}
}
