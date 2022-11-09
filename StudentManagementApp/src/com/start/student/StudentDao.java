package com.start.student;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {

	public static void addStudentToDB(Student st) {

		try {
			Connection con = ConnectionProvider.createC();
			String Query1 = "insert into students(sname,sphone,scity) values (?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(Query1);
			
			// setting values to the parameters 
			pstmt.setString(1, st.getStudentName());
			pstmt.setString(2, st.getStudentPhone());
			pstmt.setString(3, st.getStudentCity());

		} catch (Exception e) {

		}

	}

}
