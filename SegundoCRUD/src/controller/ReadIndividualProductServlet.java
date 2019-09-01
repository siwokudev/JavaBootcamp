package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.primercrud.model.Producto;

@WebServlet("/ReadIndividualProductServlet")
public class ReadIndividualProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProducto = request.getParameter("txtIdProduct");
		//response.getWriter().append("idProducto: " + idProducto);
		String propsFileName = "config.properties";
		
		Properties props = new Properties();
		InputStream stream = null;
		
		stream = getClass().getClassLoader().getResourceAsStream(propsFileName);
		
		if(stream != null) {
			props.load(stream);
		} else {
			throw new FileNotFoundException("Archivo de propiedades "+ propsFileName + " no encontrado");
		}
		
		//Paso 1 Declarar Variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String url = props.getProperty("urlServidor");
		String driver = props.getProperty("Driver");
		String SQLquery = props.getProperty("SQLqueryReadIndividualProducts");
		
		//Paso 2 Declarar los objetos conexión
		Connection conn =null;
		PreparedStatement pstmnt = null;
		ResultSet rs = null;
		
		Producto myProduct = new Producto(idProducto,"",0,0);
		
		try {
			//Paso 3 Instanciar el driver
			Class.forName(driver).getDeclaredConstructor().newInstance();
			
			//Paso 4 Abrir la conexion
			conn = DriverManager.getConnection(url, user, pass);
			
			//Paso 5 Configurar el Prepared Statement
			pstmnt = conn.prepareStatement(SQLquery);
			
			//Paso 6 pasar los parametros al prepared statement
			pstmnt.setString(1, myProduct.getIdProducto());
			
			//Paso 7 Ejecutar la consulta
			rs = pstmnt.executeQuery();
			
			//Paso 8 Mostrar resultados
			while(rs.next()) {
				response.getWriter().append("Id product: " + rs.getString("idProducto") + "<br/>");
				response.getWriter().append("Name product: " + rs.getString("nombreProducto") + "<br/>");
				response.getWriter().append("price product: " + rs.getFloat(3) + "<br/>");
				response.getWriter().append("existence product: " + rs.getInt(4) + "<br/>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				rs.close();
				pstmnt.close();
				conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
}
