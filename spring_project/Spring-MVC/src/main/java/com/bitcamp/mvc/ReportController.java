package com.bitcamp.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.bitcamp.mvc.domain.ReqReport;

@Controller
@RequestMapping("/report")
public class ReportController {
	@Autowired
	private FileUploadService service;

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String getReportForm() {
		return "/report/form";
	}

	@PostMapping("submit3")
	public String submit3(@ModelAttribute("report") ReqReport report, HttpServletRequest req) {

		System.out.println("학번 : " + report.getSno());
		System.out.println("이름 : " + report.getSname());
		System.out.println("리포트 파일 : " + report.getReport().getOriginalFilename());
		System.out.println("리포트 파일 : " + report.getReport().getContentType());
		System.out.println("리포트 파일 : " + report.getReport().getName());
		System.out.println("리포트 파일 : " + report.getReport().getSize());
		System.out.println("리포트 파일 : " + report.getReport().isEmpty());

		// model.addAttribute("sno", report.getSno());
		// model.addAttribute("sname", report.getSname());
		// model.addAttribute("report", report.getReport().getOriginalFilename());

		try {
			String fileName = service.saveFile("/uploadfile", report.getReport(), req);
			System.out.println("파일저장 완료 : " + fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/report/submit";
	}

	// /mvc/report/submit2
	@PostMapping("submit2")
	public String submit2(MultipartHttpServletRequest req, Model model) {

		MultipartFile report = req.getFile("report");

		System.out.println("학번 : " + req.getParameter("sno"));
		System.out.println("이름 : " + req.getParameter("sname"));
		System.out.println("리포트 파일 : " + report.getOriginalFilename());
		System.out.println("리포트 파일 : " + report.getContentType());
		System.out.println("리포트 파일 : " + report.getName());
		System.out.println("리포트 파일 : " + report.getSize());
		System.out.println("리포트 파일 : " + report.isEmpty());

		model.addAttribute("sno", req.getParameter("sno"));
		model.addAttribute("sname", req.getParameter("sname"));
		model.addAttribute("report", report.getOriginalFilename());

		try {
			String fileName = service.saveFile("/uploadfile", report, req);
			System.out.println("파일저장 완료 : " + fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "report/sublit";
	}

	@RequestMapping(value = "/submit1", method = RequestMethod.POST)
	public String submit1(@RequestParam("sno") String sno, @RequestParam("sname") String sname,
			@RequestParam("report") MultipartFile report, Model model, HttpServletRequest req) {
		// 출력해보기
		System.out.println("학번 : " + sno);
		System.out.println("이름 : " + sname);
		System.out.println("리포트 파일 : " + report.getOriginalFilename());
		System.out.println("리포트 파일 : " + report.getContentType());
		System.out.println("리포트 파일 : " + report.getName());
		System.out.println("리포트 파일 : " + report.getSize());
		System.out.println("리포트 파일 : " + report.isEmpty());

		String newFileName = sno + "_" + report.getOriginalFilename();

		model.addAttribute("sno", sno);
		model.addAttribute("sname", sname);
		model.addAttribute("report", report.getOriginalFilename());

		try {
			String fileName = service.saveFile("/uploadfile", report, req);
			System.out.println("파일저장 완료 : " + fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "/report/submit";
	}
}
