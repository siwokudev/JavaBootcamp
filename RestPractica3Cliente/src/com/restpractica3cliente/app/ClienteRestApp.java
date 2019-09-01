package com.restpractica3cliente.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ClienteRestApp {

	public static void main(String[] args) {
		String uri = "http://localhost:8080/CRUDRest/productos/10";
		URL urlEndPoint =  null;
		
		try {
			
			urlEndPoint = new URL(uri);
			HttpURLConnection miConexion =(HttpURLConnection) urlEndPoint.openConnection();
			miConexion.setRequestMethod("GET");
			miConexion.setRequestProperty("Accept", "application/json; charset=UTF-8");
			
			if(miConexion.getResponseCode() != 200) {
				throw new RuntimeException("Failed HTTP error code: " + miConexion.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					miConexion.getInputStream()));
			
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			miConexion.disconnect();
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
