package com.practica22.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MainPractica22 {

	public static void main(String[] args) throws Exception { //throws IOException
		// Algoritmos readers
		String fileName = "C:\\GenerationsAlan\\a\\a.txt";
		
		File miArchivo = new File(fileName);
		FileReader reader = null;
		BufferedReader buffer = null;
		String linea;
		
		try {
			reader = new FileReader(miArchivo);
			buffer = new BufferedReader(reader);
			while((linea=buffer.readLine()) != null){
				System.out.println(linea);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		} finally {
				buffer.close();
				reader.close();	
		}
		
		/*
		BufferedReader buffer = new BufferedReader(new FileReader(fileName));
		String s, s2= new String();
		
		//forma 1
		do {
			s = buffer.readLine();
			s2 += s+ "\n";
		} while(s != null);
		
		//forma 2
		while((s= buffer.readLine()) != null) {
			//s2 += s+ "\n";
			System.out.println(s);
		}
		buffer.close();
		
		System.out.println(s2);
		*/
		
		/*
		BufferedReader in = new BufferedReader( new     FileReader("IOStreamDemo.java")); 
	    String s, s2 = new String(); 
	    while( (s = in.readLine()) != null) s2 += s + "\n"; 
	    in.close(); 
	    // 1b. Se lee una línea por teclado 
	    BufferedReader stdin = new BufferedReader( new InputStreamReader(System.in)); 
	    System.out.print("Enter a line:"); System.out.println(stdin.readLine()); 
		 */
	}

}
