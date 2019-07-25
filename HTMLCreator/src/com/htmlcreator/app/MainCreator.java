package com.htmlcreator.app;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class MainCreator {

	public static void main(String[] args) {
		String projectName = "test";
		String directoryPath = "C:\\GenerationsAlan\\Workspace\\MVCPractica8\\WebContent";
		String finalPath = null;
		String[] foldersName = {"css","scripts","images","fonts","json","media","media\\audio","media\\video"};
		boolean correctInput = false;
		boolean errorWhileCreated = false;
		
		/*
		try {
			directoryPath = new File(MainCreator.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getPath();			
			System.out.println("current directory: "+ directoryPath);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		
		//directoryPath = "C:\\Generations\\Frontend"; //enable for testing
		Scanner scanner = new Scanner(System.in);
		System.out.println("HTML5 layout creator by MaeseA");		
		do {
			System.out.println("Input project name: ");
			projectName = scanner.nextLine();
			correctInput = true;
		} while(correctInput == false);		
		scanner.close();
		
		finalPath = directoryPath +"\\"+ projectName;
		
		errorWhileCreated = !(new File(finalPath)).mkdir();
		if(errorWhileCreated) {
			System.out.println("Error creating project: " + projectName);
			System.out.println(projectName + " already exists");
		} else {		
			
			for(String folder : foldersName) {
				errorWhileCreated = !(new File(finalPath + "\\" + folder)).mkdir();
				if(errorWhileCreated) {
					System.out.println("Error creating "+folder);
					errorWhileCreated = false;
				} else {
					System.out.println(folder + " created");
				}
			}
			
			BufferedWriter buffer = null;
			
			/* CSS file creation*/
			try {
				buffer = new BufferedWriter(new FileWriter(new File(finalPath + "\\css\\myStyle.css")));
				buffer.write(HTMLContent.getCSSContent());
				System.out.println("myStyle.css created");
			} catch(IOException e) {
				System.out.println("Error creating myStyle.css");
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					buffer.close();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
			
			/* js file creation*/
			try {
				buffer = new BufferedWriter(new FileWriter(new File(finalPath + "\\scripts\\myScript.js")));
				buffer.write(HTMLContent.getJSContent());
				System.out.println("myScript.js created");
			} catch(IOException e) {
				System.out.println("Error creating myScript.js");
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					buffer.close();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
			
			/* Index.html file creation */
			try {
				buffer = new BufferedWriter(new FileWriter(new File(finalPath + "\\index.html")));
				buffer.write(HTMLContent.getHTMLFileContent(projectName));
				//buffer.write(HTMLContent.getHTMLFileContent());
				System.out.println("index.html created");
			} catch(IOException e) {
				System.out.println("Error creating index.html");
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					buffer.close();
				} catch(Exception e){
					e.printStackTrace();
				}
			}
			
		}
		
		if(!errorWhileCreated) {
			System.out.println("Project created in: " + finalPath);
		}
		
		
	}

}
