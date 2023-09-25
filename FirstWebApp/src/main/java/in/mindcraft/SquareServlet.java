package in.mindcraft;

import java.io.IOException;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
//		For RequestDispacther
//		int c = (int)req.getAttribute("c");

//		Url Rewriting
//		int c = Integer.parseInt(req.getParameter("c"));
		
		
//		Using Session Object
//		HttpSession session = req.getSession();
//		int c = (int)session.getAttribute("c");
		
		
//		Cookies
		int c=0;
		Cookie [] cookies = req.getCookies();
		
		for(Cookie ck:cookies) {
			if(ck.getName().equals("c")) {
				c = Integer.parseInt(ck.getValue());
			}
		}
 		int sq = c*c;
		
//		res.getWriter().println("Square of Addition - "+sq);
 		
 		HttpSession session = req.getSession();
 		session.setAttribute("sq", sq);
 		res.sendRedirect("result.jsp");
	}
}
