package test;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/registrer")
public class Registrerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fornavn = request.getParameter("fornavn");
				String etternavn = request.getParameter("etternavn");
				java.util.Date date = new java.util.Date();
				
				

				response.setContentType("text/html; charset=ISO-8859-1");
				PrintWriter out = response.getWriter();
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head>");
				out.println("<meta charset=\"ISO-8859-1\">");
				out.println("<title>Kvittering</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<p>Hei, " + fornavn + " " + etternavn +"</p>");
				out.println("<p>Din registrering er mottatt " + date.toString() + "</p>");
				out.println("</body>");
				out.println("</html>");
		
		
		
	}

}
