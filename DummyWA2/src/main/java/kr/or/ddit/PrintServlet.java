package kr.or.ddit;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import java.io.*;

@WebServlet("/print.do")
public class PrintServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, 
		HttpServletResponse resp)throws IOException, ServletException{
		// String tomcatPath = System.getevn("catalina_home");
		String tomcatPath = System.getProperty("catalina.base");
		
		resp.getWriter().println(tomcatPath);
	}
	// POJO (Plain Old Java Object) aa
}