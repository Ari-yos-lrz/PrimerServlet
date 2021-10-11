package com.edu.uacm.progweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class miPrimerServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/* Utilizamos resqueste (req) para leer los encabezados
		 * http entrantes es decir los parametros*/
		
		/* Utilizamos response (resp) para especificar el codigo y 
		 * los encabezados de respuesta*/
		
		PrintWriter salida = resp.getWriter();
		//contenido de respuesta, es un texto html
		resp.setContentType("text/html");
		String html = "<!DOCTYPE>";
		salida.println(html+"<html>"
								+"<body>"
									+"<h1>Hola UACM</h1>"
								+"</body>"
						+"</html>");
	}

}
