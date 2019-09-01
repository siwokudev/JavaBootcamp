package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.primercrud.model.Producto;

@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProducto = request.getParameter("txtIdProduct");
		String nombreProducto = request.getParameter("txtNameProduct");
		float precioProducto = Float.parseFloat(request.getParameter("txtPriceProduct"));
		int existencias = Integer.parseInt(request.getParameter("txtExistenceProduct"));
		
		Producto prod = new Producto(idProducto, nombreProducto, precioProducto, existencias);
		
		//Paso1 Declarar las variables
		String user ="root";
		String pass ="kaspornipov123jotengo";
		String urlServidor="jdbc:mysql://localhost:3306/chilaquiles?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		//paso2 Declarar objetos
		int nRegistros = 0;
		Connection conn = null;
		PreparedStatement ps = null;
		String SQLquery = "INSERT INTO productos (idProducto, nombreProducto, precioProducto, existencias) VALUES (?,?,?,?)";
	
		//paso3 Instanciar el driver
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//paso4 Abrir conexion
			conn = DriverManager.getConnection(urlServidor, user, pass);
			//paso5 Configurar el prepared statement
			ps = conn.prepareStatement(SQLquery);
			//paso6 Configurar la sentencia SQL
			ps.setString(1, prod.getIdProducto());
			ps.setString(2, prod.getNombreProducto());
			ps.setDouble(3, prod.getPrecioProducto());
			ps.setInt(4, prod.getExistencia());
			
			//paso7 Ejecutar el prepare statement
			nRegistros = ps.executeUpdate();
			if(nRegistros > 0)
			{
				response.getWriter().append("Registros creados exitosamente");
			}
			
			//paso8 Mostrar resultados
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//paso9 Cerrar conexion
		finally
		{
			try
			{
				ps.close();
				conn.close();
			
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}


}
