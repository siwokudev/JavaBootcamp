package com.htmlcreator.app;

public abstract class HTMLContent {
	
	public static String getHTMLFileContent() {
		return "html:5";
	}
	
	public static String getHTMLFileContent(String projectName) {
		return "<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"    <head>\r\n" + 
				"        <meta charset=\"UTF-8\">\r\n" + 
				"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
				"        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n" + 
				"        <title>"+projectName +"</title>\r\n" + 
				"\r\n" + 
				"        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\r\n" + 
				"        <link rel=\"stylesheet\" href=\"css/mystyle.css\">\r\n" + 
				"    </head>\r\n" + 
				"    <body>\r\n" + 
				"        <div class=\"container\">\r\n" + 
				"            <div class=\"row\">\r\n" + 
				"                <!--My content-->\r\n" +
				"                <h2>My HTML</h2>\r\n" +
				"            </div>\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"        <!--Jquery,popper,boostrap-->\r\n" + 
				"        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\r\n" + 
				"        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\r\n" + 
				"        <script src=\"scripts/myScript.js\"></script>\r\n"+
				"    </body>\r\n" + 
				"</html>";
	}
	
	public static String getCSSContent() {
		return "h2{\r\n"
				+ "\tcolor: blue\r\n"
				+ "}\r\n";
	}
	
	public static String getJSContent() {
		return  "window.onload = function(){\r\n" + 
				"    alert(\"Hola mundo\");\r\n" + 
				"}";
	}
}
