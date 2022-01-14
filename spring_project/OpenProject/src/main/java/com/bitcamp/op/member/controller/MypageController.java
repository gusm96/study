package com.bitcamp.op.member.controller;

import java.sql.SQLException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.op.member.service.MemberMypageService;

@Controller
@RequestMapping("/member/my")
public class MypageController {
	@Autowired
	private MemberMypageService mypageService;

	@RequestMapping("/mypage")
	public void getMypage(HttpSession session, Model model) throws SQLException {
		// session 정보가 필요하다.
		System.out.println(mypageService.getMember(session));
		model.addAttribute("member", mypageService.getMember(session));
	}

}
