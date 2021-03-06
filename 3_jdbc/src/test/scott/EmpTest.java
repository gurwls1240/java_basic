package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import util.JDBCUtil;

public class EmpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sql = "select count(*) as 직속부하직원수, e.manager_id as 관리자사번, m.first_name as 관리자이름\r\n" + 
				"from EMPLOYEES e, EMPLOYEES m\r\n" + 
				"where e.manager_id = m.employee_id\r\n" + 
				"group by e.manager_id,m.first_name\r\n" + 
				"having count(*) >= 8 order by 1 desc";
		
		Connection conn = null;
		Statement st = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		int row = 0;
		
		try {
			conn = JDBCUtil.getConnection();
			st = conn.createStatement();
			ps = conn.prepareStatement(sql);
			//? setting
			// exe
			//row = ps.executeUpdate();
			rs = ps.executeQuery();
			// result handling
			while(rs.next()) {
				System.out.print(rs.getString("직속부하직원수") + "  ");
				System.out.print(rs.getString("관리자사번") + "  ");
				System.out.print(rs.getString("관리자이름") + "  ");
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, st, rs);
		}
		
		String[] jobTitle = new String[2];
		jobTitle[0] = JOptionPane.showInputDialog("찾고 싶은 jobTitle1를 입력하세요");
		jobTitle[1] = JOptionPane.showInputDialog("찾고 싶은 jobTitle2를 입력하세요");

		EmpManager em = new EmpManager();
		em.printEmployee(jobTitle);
		
		
	}

}
