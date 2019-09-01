package com.crudrest;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.crudrest.model.Producto;
import com.google.gson.Gson;

@Path("/productos")
public class ProductoService {

	@GET
	@Path("/{idProducto}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String leerProducto(@PathParam("idProducto") String idProducto) throws IOException {

		String propsFileName = "config.properties";
		String myJson = "";

		Gson objGson = new Gson();

		Properties props = new Properties();
		InputStream stream = null;

		stream = getClass().getClassLoader().getResourceAsStream(propsFileName);

		if (stream != null) {
			props.load(stream);
		} else {
			throw new FileNotFoundException("Archivo de propiedades " + propsFileName + " no encontrado");
		}

		// Paso 1 Declarar Variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String url = props.getProperty("urlServidor");
		String driver = props.getProperty("Driver");
		String SQLquery = props.getProperty("SQLqueryReadIndividualProducts");

		// Paso 2 Declarar los objetos conexión
		Connection conn = null;
		PreparedStatement pstmnt = null;
		ResultSet rs = null;

		Producto myProduct = new Producto();

		try {
			// Paso 3 Instanciar el driver
			Class.forName(driver).getDeclaredConstructor().newInstance();

			// Paso 4 Abrir la conexion
			conn = DriverManager.getConnection(url, user, pass);

			// Paso 5 Configurar el Prepared Statement
			pstmnt = conn.prepareStatement(SQLquery);

			// Paso 6 pasar los parametros al prepared statement
			pstmnt.setString(1, idProducto);

			// Paso 7 Ejecutar la consulta
			rs = pstmnt.executeQuery();
			// Paso 8 Mostrar resultados
			while (rs.next()) {

				myProduct.setId(Integer.parseInt(rs.getString("idProducto")));
				myProduct.setNombre(rs.getString("nombreProducto"));
				myProduct.setPrecio(rs.getFloat(3));
				myProduct.setExistencia(rs.getInt(4));

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
		// System.out.println("MyJson value: " +myJson);
		return objGson.toJson(myProduct);
	}

	@POST
	@Path("/{idProducto}/{nombreProducto}/{precioProducto}/{existencias}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String crearProducto(@PathParam("idProducto") String idProducto,
			@PathParam("nombreProducto") String nombreProducto, @PathParam("precioProducto") float precioProducto,
			@PathParam("existencias") int existencias) throws IOException {
		Properties props = new Properties();
		InputStream miStream = null;
		String miArchivoProps = "config.properties";
		miStream = getClass().getClassLoader().getResourceAsStream(miArchivoProps);
		if (miStream != null) {
			props.load(miStream);
		} else {
			throw new FileNotFoundException("Archivo de Propiedades:" + miArchivoProps + " no se encuentra");
		}

		// Paso 1. Declarar variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String urlServidor = props.getProperty("urlServidor");
		String miDriver = props.getProperty("Driver");
		String sentenciaSQL = props.getProperty("SQLqueryInsert");
		String resultadoJson = "";

		// Paso 2. Declarar objetos conexión
		Connection conn = null;
		PreparedStatement pstmnt = null;
		// ResultSet rs = null;
		int nRegistros = 0;
		Producto miProducto = new Producto(Integer.parseInt(idProducto), nombreProducto,precioProducto, existencias);

		try {
			// Paso 3. Instanciar el driver
			Class.forName(miDriver).getDeclaredConstructor().newInstance();
			// Paso 4. Abrir la conexión
			conn = DriverManager.getConnection(urlServidor, user, pass);
			// Paso 5. Configurar el Prepared Statement
			pstmnt = conn.prepareStatement(sentenciaSQL);
			// Paso 6. Pasar los parámetros al Prepared Statement
			pstmnt.setString(1, miProducto.getId() + "");
			pstmnt.setString(2, miProducto.getNombre());
			pstmnt.setDouble(3, miProducto.getPrecio());
			pstmnt.setInt(4, miProducto.getExistencia());

			// Paso 7. Ejecutar la consulta
			nRegistros = pstmnt.executeUpdate();
			// Paso 8. Mostrar resultados
			/*
			 * rs.next(); Productos miProducto2 = new
			 * Productos(rs.getString("idProducto"),rs.getString("nombreProducto"),rs.
			 * getDouble(3),rs.getInt(4));
			 */
			Gson miGson = new Gson();
			resultadoJson = miGson.toJson(miProducto);
			resultadoJson += "Registro Creado con éxito";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// rs.close();
				pstmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultadoJson;
	}

	@DELETE
	@Path("/{idProducto}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.TEXT_PLAIN)
	public String borrarProducto(@PathParam("idProducto") String idProducto) throws IOException {
		
		String propsFileName = "config.properties";
		String myJson = "";

		Gson objGson = new Gson();

		Properties props = new Properties();
		InputStream stream = null;

		stream = getClass().getClassLoader().getResourceAsStream(propsFileName);

		if (stream != null) {
			props.load(stream);
		} else {
			throw new FileNotFoundException("Archivo de propiedades " + propsFileName + " no encontrado");
		}

		// Paso 1 Declarar Variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String url = props.getProperty("urlServidor");
		String driver = props.getProperty("Driver");
		String SQLquery = props.getProperty("SQLqueryDeleteProducts");

		// Paso 2 Declarar los objetos conexión
		Connection conn = null;
		PreparedStatement pstmnt = null;
		//ResultSet rs = null;
		int nRegistros = 0;

		//Producto myProduct = new Producto();

		try {
			// Paso 3 Instanciar el driver
			Class.forName(driver).getDeclaredConstructor().newInstance();

			// Paso 4 Abrir la conexion
			conn = DriverManager.getConnection(url, user, pass);

			// Paso 5 Configurar el Prepared Statement
			pstmnt = conn.prepareStatement(SQLquery);

			// Paso 6 pasar los parametros al prepared statement
			pstmnt.setString(1, idProducto);

			// Paso 7 Ejecutar la consulta
			nRegistros = pstmnt.executeUpdate();
			// Paso 8 Mostrar resultados
			
			/*
			while (rs.next()) {
				
				myProduct.setId(Integer.parseInt(rs.getString("idProducto")));
				myProduct.setNombre(rs.getString("nombreProducto"));
				myProduct.setPrecio(rs.getFloat(3));
				myProduct.setExistencia(rs.getInt(4));
				

			}*/
			
			if(nRegistros != 0) {
				myJson = "Producto Borrado";
			}else {
				myJson = "Error al borrar";
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				//rs.close();
				pstmnt.close();
				conn.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return myJson;
	}

}
