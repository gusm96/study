package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberLogoutController {
	@RequestMapping("/member/logout")
	public String logout(HttpSession session) {
		// invalidate() 함수는 session을 없애고 session에 속해있는 값을 모두 삭제한다.
		session.invalidate();
		
		return "redirect:/";
	}
}
