package com.bitcamp.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.op.member.domain.MemberRegRequest;

@Controller
@RequestMapping("/member/reg")
public class MemberRegController {
	@GetMapping
	public String getRegForm() {
		return "member/regform";
	}

	@PostMapping
	public void memberReg(MemberRegRequest regRequest, Model model) {
		System.out.println(regRequest);
		model.addAttribute("result", 1);
	}
}
