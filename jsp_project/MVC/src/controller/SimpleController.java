package controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SimpleController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 사용자 요청 받기
		doProcess(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. 사용자 요청 받기
		doProcess(req, resp);
	}

	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 2. 사용자 요청을 분석 : 파라미터값을 이용해서 분석
		String type = req.getParameter("type");
		
		// 3. 사용자 요청에 맞는 데이터 처리 : 요청에 따른 분기
		// 결과 데이터를 생성
		
		// 응답 결과 객체
		Object result = null; // view 페이지에서 toString()으로 출력
		// View page 경로
		String viewPage = "/WEB-INF/views/simpleview.jsp";
		
		if(type == null || type.equals("greeting")) {
			result = "안녕하세요"; // Object <- String
			viewPage = "/WEB-INF/views/greeting.jsp";
		}else if(type.equals("date")) {
			result = new Date(); // Object <- Date
			viewPage = "/WEB-INF/views/date.jsp";
		}else {
			result = "Invalid Request";
		}
		
		// 4. 결과를 req 객체의 속성에 저장 : view 페이지에 결과 데이터를 공유(전달)
		req.setAttribute("result", result);
		
		// 5. view 페이지를 지정(선택) -> 포워딩
		RequestDispatcher dispatcher = req.getRequestDispatcher(viewPage);
		dispatcher.forward(req, resp);
		
	}

}
