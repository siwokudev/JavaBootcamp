package com.tarea1.app;
import com.tarea1.model.Multiplicaciones;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainTarea1 {

	public static void main(String[] args)  {
		int lowerLimit=0;
		int upperLimit=0;
		int start = 0;
		int end = 20;
		boolean correctInput;
		String multiplicaciones = "";
		Scanner scanner = new Scanner(System.in);
		
		correctInput = false;
		do {			
			try {
				System.out.println("Dame un numero de inicio");
				lowerLimit = Integer.parseInt(scanner.nextLine());
				correctInput = true;
			} catch (NumberFormatException e) {				
				System.out.println("numero no valido");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while(!correctInput);

		correctInput = false;
		do {			
			try {
				System.out.println("Dame un numero de fin");
				upperLimit = Integer.parseInt(scanner.nextLine());
				correctInput = true;
			} catch (NumberFormatException e) {				
				System.out.println("numero no valido");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while(!correctInput);

		scanner.close();
		
		for(int j = start; j<= end; j++) {
			for(int i = lowerLimit; i <= upperLimit; i++) {			
				multiplicaciones += Multiplicaciones.multiplica(i, j) + "\t";
			}
			multiplicaciones += "\n";
		}
		
		//System.out.println(multiplicaciones);
		String fileName = "C:\\Generations\\Workspace\\Tarea1\\Files\\Multiplicaciones.txt";
		PrintWriter out = null;
		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(fileName)));
			out.print(multiplicaciones);
		} catch (IOException e) {
			System.out.println("Error al escribir en archivo");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		out.close();
	}

}
