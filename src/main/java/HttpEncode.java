/**
 * $Id$
 * (C)2011 Sohu Inc.
 */

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: iamct
 * @sine: 12-4-16 ÏÂÎç11:26
 */
public class HttpEncode extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("AaAaAaBBAaBBAaAaAaAa"));
		System.out.println(req.getParameter("abc"));
		String str = req.getQueryString();
		req.setCharacterEncoding("gbk");
		System.out.println(req.getCharacterEncoding());
		String encode = null;
		try {
			encode = req.getParameter("encode");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(str);
		System.out.println(encode);

	}
		@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(req.getParameter("AaAaAaBBAaBBAaAaAaAa"));
		System.out.println(req.getParameter("abc"));
		String str = req.getQueryString();
		req.setCharacterEncoding("gbk");
		System.out.println(req.getCharacterEncoding());
		String encode = null;
		try {
			encode = req.getParameter("encode");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(str);
		System.out.println(encode);

	}

}
//req.setAttribute("org.mortbay.jetty.Request.queryEncoding","gbk");