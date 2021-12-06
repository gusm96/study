package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet({ "/Signup", "/signup" })
public class SignupServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String uid = request.getParameter("userid");
		String pw = request.getParameter("pw");
		String pw2 = request.getParameter("pw2");
		String username = request.getParameter("username");
		System.out.println("userid: " + uid);
		System.out.println("pw: " + pw);
		System.out.println("pw2: " + pw2);
		System.out.println("username: " + username);

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("	<head><title>Signup Servlet</title></head>");
		out.println("	<body>");
		out.println("		<h1>");
		out.println("			userid: " + uid + "<br>");
		out.println("			pw: " + pw + "<br>");
		out.println("			name: " + username + "<br>");
		out.println("		</h1>");
		out.println("	</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
