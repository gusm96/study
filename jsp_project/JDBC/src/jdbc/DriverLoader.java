package jdbc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(
		loadOnStartup = 1, 
		initParams = { 
				@WebInitParam(name = "driver", value = "com.mysql.cj.jdbc.Driver")
		})
public class DriverLoader extends HttpServlet {
	
	public void init(ServletConfig config) throws ServletException {
		String driver = config.getInitParameter("driver");
		
		// DB Driver load
		try {
			Class.forName(driver);
			System.out.println("mysql 드라이브 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("mysql 드라이브 로드 실패");
			e.printStackTrace();
		}
	}

}
