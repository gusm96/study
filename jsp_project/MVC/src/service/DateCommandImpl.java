package service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest req, HttpServletResponse res) {

		// 사용자 요청 처리
		// JDBC, 데이터 분석, 다른 서버의 API 처리
		Date now = new Date();
		
		// 결과 데이터를 req 속성에 저장
		req.setAttribute("result", now);
		
		// View 지정
		String viewPage = "/WEB-INF/views/date.jsp";
		return viewPage; // viewPage 경로를 반환
	}

}
