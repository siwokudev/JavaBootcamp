package com.practica23.app;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class practica23 {

	public static void main(String[] args)  throws Exception {
		// Escritura por linea
		String fileLocation = "C:\\GenerationsAlan\\b.txt";
		String fileContent = "Alan Jimenez Ramirez \n";
		int qty = 10;
		
		File miArchivo = new File(fileLocation);
		FileWriter writer = null;
		BufferedWriter buffer = null;
		
		try {
			writer = new FileWriter(miArchivo,true);
			buffer = new BufferedWriter(writer);
			
			for (int i=0; i<qty; i++) {
				buffer.write(fileContent); 
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buffer.close();
				writer.close();
			} catch(IOException e) {
				e.printStackTrace();
			}

		}
		
		/*
		PrintWriter writer = new PrintWriter( new BufferedWriter( new FileWriter(fileLocation)));
		for (int i=0; i<qty; i++) {
			writer.println(fileContent); 
		}
		writer.close(); 
		*/

		/*
		 * String []s = {“hola“, “que”, “tal”}; 
			// Se inicializa s
			PrintWriter out1 = new PrintWriter( new BufferedWriter( new FileWriter("IODemo.out"))); 
			int lineCount = 1; 
				for (int i=0; i<s.length(); i++) out1.println(lineCount++ + ": " + s[i]); 
			out1.close(); 

		 
		 */

	}

}
