package com.tarea2.model;

public abstract class HTML {

	public static String header(String content) {
		return "<!DOCTYPE html>\n<html>\n"+content+"\n</html>";
	}
	
	public static String header(String lang, String content ) {
		return "<!DOCTYPE html lang=\"" +lang+ "\">\n<html>\n"+content+"\n</html>";
	}
	
	public static String head(String content) {
		return "<head>\n"+content+"\n</head>";
	}
	
	public static String title(String content) {
		return "<title>\n"+content+"\n</title>\n";
	}
	
	public static String body(String content) {
		return "<body>\n"+content+"\n</body>\n";
	}
	
	public static String h1(String content) {
		return "<h1>"+content+"\n</h1>";
	}
	
	public static String h2(String content) {
		return "<h2>"+content+"\n</h2>";
	}
	
	public static String h3(String content) {
		return "<h3>"+content+"\n</h3>";
	}
	
	public static String paragraph(String content) {
		return "<p>"+content+"\n</p>";
	}
	
	public static String paragraph(String title, String content) {
		return "<p title= \""+title+"\">\n"+content+"\n</p>";
	}
	
	public static String link(String link, String content) {
		return "<a href=\""+link+"\">"+content+"</a>";
	}
	
	public static String button(String content) {	//deprecated
		return "<button>\n"+content+"</button>";
	}
	
	public static String image(String src) {
		 return String.format( "<img src=\"%s\" />",src);
	}
	
	public static String image(String src, int width, int height) {
		 return String.format( "<img src=\"%s\" width=\"%d\" height=\"%d\" />",src,width,height);
	}
	
	public static String image(String src, String alt, int width, int height) {
		//			String s = "<img src=\""+src+"\" alt=\""+alt+"\" width=\""+width+"\" height=\""+height+"\" />";
		 return String.format( "<img src=\"%s\" alt=\"%s\" width=\"%d\" height=\"%d\" />",src,alt,width,height);
	}
}
