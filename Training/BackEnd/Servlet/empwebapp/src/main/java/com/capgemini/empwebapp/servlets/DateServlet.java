package com.capgemini.empwebapp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DateServlet extends HttpServlet {
		
	public DateServlet() {
		System.out.println("Its Instantiation Phase");
	}
	
	@Override
	public void init() throws ServletException {
		System.out.println("Initialization phase");
	}
	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Its a service phase...");
		Date date = new Date(); // to show system's current date and time
		
		ServletContext context = getServletContext();
		String companyNameVal = context.getInitParameter("companyName");
		

		//resp.setHeader("refresh" ,"1"); // to refresh the page after each second using java code
		resp.setContentType("text/html"); //what type of response is going to be displayed

		PrintWriter out = resp.getWriter();
		out.println("<html>");
		/* TO REFRESH USING HTML CODE 
		 * out.println("<head>");
		 * out.println("<meta http-equiv='refresh' content='1'>");
		 * out.println("</head>");
		 */
		out.println("<body>");
		out.println("<h1>Current System Date & Time -<br>");
		out.println(date + "</h1>");
		out.println("<h2>Context Param Company name Value is " + companyNameVal + "</h2>");
		out.println("</body>");
		out.println("</html>");

	} //End Of doGet
	
	@Override
	public void destroy() {
		super.destroy();
		System.out.println("It's destroy phase ...");
	}
	

}//End Of Class


