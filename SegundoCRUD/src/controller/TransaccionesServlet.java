package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/TransaccionesServlet")
public class TransaccionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String propsFileName = "config.properties";
		
		Properties props = new Properties();
		InputStream stream = null;
		
		stream = getClass().getClassLoader().getResourceAsStream(propsFileName);
		
		if(stream != null) {
			props.load(stream);
		}else {
			throw new FileNotFoundException("archivo config no encontrado");
		}
		
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String url = props.getProperty("urlServidor");
		String driver = props.getProperty("Driver");
		
		Connection conn = null;
		PreparedStatement pstmnt = null;
		
		String[] insert = new String[6];
		insert[0]="INSERT INTO productos VALUES('29','cerveza',20,100)";
		insert[1]="INSERT INTO productos VALUES('30','coca-cola',15,100)";
		insert[2]="INSERT INTO productos VALUES('31','pepsi',32,100)";
		insert[3]="INSERT INTO productos VALUES('26','fanta',19,100)";
		insert[4]="INSERT INTO productos VALUES('27','café',33,100)";
		insert[5]="INSERT INTO productos VALUES('28','leche',8,100)";
		try {

			Class.forName(driver).getDeclaredConstructor().newInstance();
			//paso 4 Abrimos la conexion

			conn = DriverManager.getConnection(url,user,pass);
			conn.setAutoCommit(false);
			
			//insercion de datos por batch
			for(String in : insert) {
				pstmnt = conn.prepareStatement(in);
				pstmnt.executeUpdate();
			}
			//preservar cambios
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		} finally {
			
			try {
				pstmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
