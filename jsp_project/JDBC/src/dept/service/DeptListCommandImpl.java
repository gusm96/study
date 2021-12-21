package dept.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeptListCommandImpl implements Command{

	@Override
	public String getPage(HttpServletRequest req, HttpServletResponse res) {
		
		// 화면 출력할 List를 구해서 view 로 전달
		return "/WEB-INF/views/dept/list.jsp";
	}

	
}
