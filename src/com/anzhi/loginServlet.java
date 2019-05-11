package com.anzhi;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class loginServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	 public void doGet(HttpServletRequest request, HttpServletResponse
	 response)
	 throws ServletException, IOException {
		 doPost(request,response);
	//
	// response.setContentType("text/html");
	// PrintWriter out = response.getWriter();
	// out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
	// out.println("<HTML>");
	// out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
	// out.println("  <BODY>");
	// out.print("    This is ");
	// out.print(this.getClass());
	// out.println(", using the GET method");
	// out.println("  </BODY>");
	// out.println("</HTML>");
	// out.flush();
	// out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	@SuppressWarnings("unused")
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><meta charset='UTF-8'><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("  <h1>√‹¬Î¥ÌŒÛ</h1> ");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
		
		
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		request.setAttribute("name", userName);
//		request.setAttribute("pwd", password);
//		String url="jdbc:mysql://localhost:3306/studb";
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			Connection con = (Connection) DriverManager.getConnection(url, "root", "admin");
//			Statement sta = (Statement) con.createStatement();
//			String sql="select * from denglu";
//
//			PreparedStatement pst=null;	
//			pst=(PreparedStatement) con.prepareStatement(sql);
//			ResultSet a = (ResultSet) pst.executeQuery();
//			while (a.next()) {
//				if(a.getString("name").equals(userName)){
//					request.getRequestDispatcher("sa").forward(request, response);
//				}else{
////					 response.sendRedirect("zhuce.html");
//					request.getRequestDispatcher("zhuce.html").forward(request, response);
//				}
////				String name = a.getString("name");
////				String pwd = a.getString("pwd");
//				// if (userName.equals(name) && password.equals(pwd)) {
//				// request.getRequestDispatcher("sa").forward(request,
//				// response);
//				// } else {
//				// request.getRequestDispatcher("sb").forward(request,
//				// response);
//				// }
//			}

//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	// out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
	// out.println("<HTML>");
	// out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
	// out.println("  <BODY>");
	// out.print("    This is ");
	// out.print(this.getClass());
	// out.println(", using the POST method");
	// out.println("  </BODY>");
	// out.println("</HTML>");
	// out.flush();
	// out.close();
}
