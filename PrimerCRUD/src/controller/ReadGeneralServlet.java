package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadGeneralServlet")
public class ReadGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Read General Product");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user="root";
		String pass="kaspornipov123jotengo";
		String urlServidorDB= "jdbc:mysql://localhost:3306/chilaquiles?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		Connection conn = null;
		Statement stmnt = null;
		ResultSet rs = null;
		
		String sqlSentence = "SELECT * FROM productos";
		PrintWriter salida = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			conn = DriverManager.getConnection(urlServidorDB, user, pass);
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sqlSentence);
			while(rs.next()) {
				//forma 1
				/*
				salida.append(rs.getString(1));
				salida.append("<br>");
				salida.append(rs.getString(2));
				salida.append("<br>");
				salida.append(""+rs.getDouble(3));
				salida.append("<br>");
				salida.append(""+rs.getInt(1));
				*/
				//forma 2
				
				salida.append(rs.getString("idProducto") +" ");
				salida.append(rs.getString("nombreProducto") +" ");
				salida.append(rs.getString("precioProducto") +" ");
				salida.append(rs.getString("existencias"));
				salida.append("<br/>");
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
