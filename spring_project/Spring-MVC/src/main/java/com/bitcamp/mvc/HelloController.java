package com.bitcamp.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

// @Controller 반드시 해주어야 함
@Controller
public class HelloController {
	@Autowired
	HelloService service;
	// 주입 받아야한다

	// 사용자 uri 등록 : 실행할 메소드를 정의
	// http://localhost:8080/mvc/hello
	@RequestMapping("/hello")
	public ModelAndView hello() {

		ModelAndView view = new ModelAndView();
		// view name 지정
		view.setViewName("hello/hello");
		/* /WEB-INF/views/hello/hello.jsp */
		// view에 전달할 결과 데이터 설정
		view.addObject("greeting", service.getGreeting());
		return view;
	}
}
