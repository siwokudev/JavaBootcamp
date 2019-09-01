package controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gson.Gson;
import com.primercrud.model.Producto;

@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpServletRequest n = request;
		Producto producto = new Producto(
				n.getParameter("txtIdProduct"),
				n.getParameter("txtNameProduct"),
				Float.parseFloat(n.getParameter("txtPriceProduct")),
				Integer.parseInt(n.getParameter("txtExistenceProduct")));

		response.setContentType("application/json");
		
		//pasos para conectar a la base de datos
		//paso 1 Declarar las variables de acceso
		String user ="root";
		String pass ="kaspornipov123jotengo";
		String urlServidor="jdbc:mysql://localhost:3306/chilaquiles?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sentenciaSQL="";
		
		//paso 2 Declarar los objetos de conexion
		Connection conn = null;
		Statement stmnt = null;
		int nRegistros = 0;
		
		try {
			//paso 3 iniciar el driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//paso 4 Abrir la conexion
			conn = DriverManager.getConnection(urlServidor, user, pass);
			stmnt = conn.createStatement();
			//paso 5 Preparar el comando SQL a ejecutar


			sentenciaSQL = String.format("INSERT INTO productos (idProducto, nombreProducto, precioProducto, existencias) values('%s','%s',%f,%d)",
					producto.getIdProducto(),
					producto.getNombreProducto(),
					producto.getPrecioProducto(),
					producto.getExistencia());
			
			//paso 6 ejecutar el comando SQL en la BD
			//el metodo executeQuery solo utiliza el metodo SELECT
			//el metodo Update utiliza los metodos INSERT, UPDATE, DELETE
			
			
			nRegistros = stmnt.executeUpdate(sentenciaSQL);
			
			//paso 7 Cerrar las conexiones
			if(nRegistros>0) {
				response.getWriter().append("Guardado exitosamente");
			} else {
				response.getWriter().append("error");
			}
			
			try {
				
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

	}

}
