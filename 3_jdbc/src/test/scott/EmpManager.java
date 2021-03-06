package test.scott;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.JDBCUtil;

public class EmpManager {
	private String sql = "select employee_id , salary ,first_name,job_title\r\n" + 
			"from EMPLOYEES , JOBS\r\n" + 
			"where EMPLOYEES.job_id = JOBS.job_id\r\n" + 
			"and upper(job_title) like upper(?) or upper(job_title) like upper(?)";
	String jobTitle1;
	String jobTitle2;
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	int row = 0;
	
	public EmpManager() {
		conn = JDBCUtil.getConnection();
		try {
			ps = conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printEmployee(String jobs[]) {
		jobTitle1 = jobs[0];
		jobTitle2 = jobs[1];
		System.out.println(jobTitle1);
		System.out.println(jobTitle2);
		try {
			ps.setString(1, "%"+jobTitle1+"%");
			ps.setString(2, "%"+jobTitle2+"%");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getString("employee_id") + "  ");
				System.out.print(rs.getString("first_name") + "  ");
				System.out.print(rs.getString("salary") + "  ");
				System.out.print(rs.getString("job_title") + "  ");
				System.out.println();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}
