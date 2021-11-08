package jdbc;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcTestPreparedStatmentDMLTest {
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 2. 연결 : Connection
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1621:xe";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(jdbcUrl, user, password);

			System.out.println("데이터베이스 연결 성공!");

			// 3. 작업 : CRUD -> PreparedStatement 객체생성, 먼저 SQL을 등록 후 사용
			String sql ="insert into dept values(?, ?, ?)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 90);
			pstmt.setString(2, "DEV");
			pstmt.setString(3, "SEOUL");
			
			
			// DML 실행
			int resultCnt = pstmt.executeUpdate();
			
			if (resultCnt > 0) {
				System.out.println("입력되었습니다.");
			}else {
				System.out.println("입력 실패!");
			}

			// 4. 종료 : close()
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("데이터베이스에 연결할 수 없습니다.\n연결실패!");
			e.printStackTrace();
		} finally {

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

	}
}
