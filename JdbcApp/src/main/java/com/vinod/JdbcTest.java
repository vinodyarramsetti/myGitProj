package com.vinod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTest {
		Connection con;
		Statement st;
		ResultSet rs;

		public JdbcTest() {
		try {
		 Class.forName("oracle.jdbc.OracleDriver");
	   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "vinod", "vinod123");
		 st = con.createStatement();
		 } catch (Exception e) {
		 e.printStackTrace();
		 }
		}
		public void displayEmpDetails() {
			 try {
			 rs = st.executeQuery("select * from Student");
			 //System.out.println("\tENAME\tESAL\tEADDR");
			// System.out.println("------------------------------");
			 while(rs.next()) {
			 System.out.print(rs.getString(1)+"\t");
			 System.out.print(rs.getInt(2)+"\t");
			 System.out.print(rs.getString(3)+"\t");	
			 System.out.println();
			 }
			 } catch (Exception e) {
			 e.printStackTrace();
			 }
}
}

