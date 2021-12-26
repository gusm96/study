package dept.service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dept.dao.DeptDao;
import dept.domain.Dept;
import jdbc.ConnectionProvider;
import jdbc.util.JdbcUtil;

public class DeptEditCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest req, HttpServletResponse res) {

		String view = null;
		Connection conn = null;
		Dept dept = null;

		if (req.getMethod().equals("GET")) {

			// deptno 받기
			String deptno = req.getParameter("deptno");

			// DAO -> Dept 객체 -> req 저장
			try {
				conn = ConnectionProvider.getConnection();

				dept = DeptDao.getInstance().selectByDeptno(conn, deptno);

				System.out.println("edit: " + dept);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			req.setAttribute("dept", dept);

			view = "/WEB-INF/views/dept/editform.jsp";
		} else if (req.getMethod().equals("POST")) {

			try {
				req.setCharacterEncoding("utf-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			// 수정하고자하는 데이터를 받는다.
			String deptno = req.getParameter("deptno");
			String dname = req.getParameter("dname");
			String loc = req.getParameter("loc");

			// Dao 수정 처리
			int dcnt = 0;

			try {
				conn = ConnectionProvider.getConnection();
				dept = new Dept(Integer.parseInt(deptno), dname, loc);

				dcnt = DeptDao.getInstance().editDept(conn, dept);

			} catch (SQLException e) {
				e.printStackTrace();
			}
//			req.setAttribute("result", dcnt);
			req.setAttribute("result", dcnt>0 ? "수정되었습니다.":"잘못된 요청입니다. 확인해주세요.");
			view = "/WEB-INF/views/dept/edit.jsp";
		}

		return view;
	}

}
