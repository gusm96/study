package com.bitcamp.op.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberListController {

	@RequestMapping("/member/manager/list")
	public void getListPage(@RequestParam(value = "p", defaultValue = "1") int pageNumber , Model model) {
		model.addAttribute("");
	}
}
