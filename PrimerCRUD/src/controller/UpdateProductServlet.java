package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Conection String (cadena de conexion)
		String user = "root";
		String pass = "kaspornipov123jotengo";
		String urlServidorDB = "jdbc:mysql://localhost:3306/chilaquiles?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		Connection conn = null;
		Statement stmnt = null;
		int nRegistros = 0;

		String sqlSentence =String.format("UPDATE productos SET idProducto='%s',"
				+ "nombreProducto='%s',"
				+ "precioProducto=%s,"
				+ "existencias=%s WHERE idProducto='%s'",
				request.getParameter("txtIdProduct"),
				request.getParameter("txtNameProduct"),
				request.getParameter("txtPriceProduct"),
				request.getParameter("txtExistenceProduct"),
				request.getParameter("txtIdProduct")
				);
		PrintWriter salida = response.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getConstructor().newInstance();
			conn = DriverManager.getConnection(urlServidorDB, user, pass);
			stmnt = conn.createStatement();
			nRegistros = stmnt.executeUpdate(sqlSentence);
			if (nRegistros > 0) {
				salida.append("Updated succesfully");
			} else {
				salida.append("error");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				stmnt.close();
				conn.close();
				salida.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
