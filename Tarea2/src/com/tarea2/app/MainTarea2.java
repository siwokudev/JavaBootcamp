package com.tarea2.app;

import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.tarea2.model.HTML;

public class MainTarea2 {

	public static void main(String[] args) {
		
		String directoryName = "C:\\GenerationsAlan\\Workspace\\Tarea2\\Files\\";
		String fileName = "index.html";
		String name;
		String fileContent;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Dame un nombre");
		name = scanner.nextLine();
		

		
		fileContent = HTML.header(
				HTML.title("Pagina Generations")+
				HTML.body(HTML.h1(name) 
						+ HTML.paragraph("prueba de h2")
						+ HTML.button(HTML.link("https://www.youtube.com//", "videos"))));
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new BufferedWriter(new FileWriter(new File(directoryName + fileName))));
			writer.print(fileContent);
		} catch (IOException e) {
			System.out.println("Error al escribir archivo");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
			writer.close();
			System.out.println("File Created");
		}
		
		
		if (Desktop.isDesktopSupported()) {
		    try {
		        File myFile = new File(directoryName + fileName);
		        Desktop.getDesktop().open(myFile);
		    } catch (IOException ex) {
		        // no application registered for PDFs
		    	System.out.println("Error al abrir archivo");
		    }
		}
		
	}

}
