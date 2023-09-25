package in.mindcraft;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException 
	{
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		int c = a + b;
		System.out.println(c);
		res.getWriter().println("Addition - " +c);
//		
//		req.setAttribute("c", c);
//	
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		
//		rd.forward(req, res);
		
		
//		Url Rewriting
//		res.sendRedirect("sq?c="+c);
		
//		Using Session 
//		HttpSession session = req.getSession();
//		session.setAttribute("c", c);

		
//		Cookies
//		Cookie cookie = new Cookie("c", c+"");  //the 2nd parameter is concatination as the c is a number by concating it with "" it converts to string.
//		res.addCookie(cookie);
//		
//		res.sendRedirect("sq");
	}
	
	
}
