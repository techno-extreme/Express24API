import java.sql.*;
import java.io.*;
import oracle.jdbc.*;

public class consultations{
	public static void insertPatient (String name, String surname, String nationalid, String patientid, Date date, String paymentid, String description,
										String sex, Integer age, String address, string occupation, Date dob, String relevanthistory, Integer cell, String medicalaid, 
										String medicalaidnumber, String suffix, String membername, String relationship)
										
	throws SQLException
	{
		String sql = "INSERT INTO consultations VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try {
				Connection conn = DriverManager.getConnection("jdbc:default:connection:");
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, name);
				pstmt.setString(2, surname);
				pstmt.setString(3, nationalid);
				pstmt.setString(4, patientid);
				pstmt.setString(5, date);
				pstmt.setString(6, paymentid);
				pstmt.setString(7, description);
				pstmt.setString(8, sex);
				pstmt.setString(9, age); 
				pstmt.setString(10, address); 
				pstmt.setString(11, occupation); 
				pstmt.setString(12, dob);
				pstmt.setString(13, relevanthistory);
				pstmt.setString(14, cell);
				pstmt.setString(15, medicalaid);
				pstmt.setString(16, medicalaidnumber);
				pstmt.setString(17, suffix);
				pstmt.setString(18, membername);
				pstmt.setString(19, relationship);
				pstmt.executeUpdate();
				pstmtclose();
		
		}	catch (SQLException e) {
			System.err.println(e.getMessage());
		}	
}

public static void updatePatient (String name, String surname, String nationalid, String patientid, Date date, String paymentid, String description,
										String sex, Integer age, String address, string occupation, Date dob, String relevanthistory, Integer cell, String medicalaid, 
										String medicalaidnumber, String suffix, String membername, String relationship)
	throws SQLException
	{
		String sql = "UPDATE consultations set name = ?" + "WHERE patientid = ?";
		try {
			Connection conn = DriverManager.getConnection("jdbc:default:connection:");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(4, patientid);
			pstmt.executeUpdate();
			pstmtclose();
		}	catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
public static void callPatient (String name, String surname, String nationalid, String patientid, Date date, String paymentid, String description,
										String sex, Integer age, String address, string occupation, Date dob, String relevanthistory, Integer cell, String medicalaid, 
										String medicalaidnumber, String suffix, String membername, String relationship)
	throws SQLException
	{
		try {
			String sql = "SELECT * from consultations WHERE patientid = ?";
			Connection conn = DriverManager.getConnection("jdbc:default:connection:");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.executeQuery();
			pstmtclose();
		}	catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
	
