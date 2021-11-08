package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class JdbcPreparedStatmentSelectTest {
	public static void main(String[] args) {

		Connection conn = null;
	//	Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// Dept 저장을 위한 List<Dept>
		List<Dept> list = new ArrayList<Dept>();

		try {
			// 1. 드라이버 로드 : 프로그램에서 한번만 실행하면 된다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 : Connection
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1621:xe";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(jdbcUrl, user, password);

			System.out.println("데이터베이스 연결 성공!");

			// 3. 작업 : CRUD -> PreparedStatement 객체생성
			// SQL 을 등록해서 생성하기 때문에 sql을 먼저 작성
			
			// sql : select
			String sql = "select * from dept where deptno=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 70);
			
			rs =pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
			

			// 4. 종료 : close()
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스에 연결할 수 없습니다.\n연결실패!");
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("부서 리스트");
		System.out.println("--------------------------------------------");
		System.out.println("부서번호\t부서이름\t위치");
		System.out.println("--------------------------------------------");
		for (Dept dept : list) {
			System.out.println(dept);
		}
	}
}
