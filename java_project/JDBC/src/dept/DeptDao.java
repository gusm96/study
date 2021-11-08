package dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

// Data Access Object : SQL 처리만 하는 클래스
public class DeptDao {

	// 전체 리스트 구하는 메소드 : select -> Connection을 전달 받고, List<Dept>
	public List<Dept> selectAllList(Connection conn) {
		Statement stmt = null;
		ResultSet rs = null;
		List<Dept> result = new ArrayList<Dept>();
		try {
			// 결과 생성
			stmt = conn.createStatement();

			String sql = "select * from dept";
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				result.add(new Dept(rs.getInt(1), rs.getString(2), rs.getString(3)));
			}
		} catch (SQLException e) {
			System.out.println("예외");
			e.printStackTrace();
		} finally {
			JdbcUtil.close(stmt);
			JdbcUtil.close(rs);
		}

		return result;
	}

	// 부서 정보를 검색하는 메소드 : select -> Connection을 전달 받고, Dept
	public Dept selectByDeptno(Connection conn, int deptno) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		// 검색 결과 부서정보
		Dept dept = null;

		// sql : select
		String sql = "select * from dept where deptni=?";
		// 결과 -> 1또는 0행
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				dept = new Dept(rs.getInt(1), rs.getString(2), rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(pstmt);

		}

		return dept;
	}

	// 부서 정보를 입력하는 메소드 : insert -> Dept 객체를 전달 받아서 수정
	public int insertDept(Connection conn, Dept dept) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;

		// sql : insert
		String sql = "insert into dept values (?, ?, ?)";

		try {
			pstmt = conn.prepareStatement(sql);
			// sql 파라미터 설정
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;
	}

	// 부서 정보를 수정하는 매소드 : update -> Dept 객체를 전달 받아서 수정

	public int editDept(Connection conn, Dept dept) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;

		// sql : update
		String sql = "update dept set dname=?, loc=? where deptno=?";

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, dept.getDname());
			pstmt.setString(2, dept.getLoc());
			pstmt.setInt(3, dept.getDeptno());

			resultCnt = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;
	}
	// 부서 정보를 삭제하는 메소드 : delete -> 부서번호(PK)를 전달 받아서 삭제

	public int deleteDept(Connection conn, int deptno) {
		PreparedStatement pstmt = null;
		int resultCnt = 0;

		// sql : delete
		String sql = "delete from dept where deptno=?";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);

			resultCnt = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}

		return resultCnt;
	}

}
