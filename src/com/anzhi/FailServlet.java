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
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class FailServlet extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		 response.setCharacterEncoding("UTF-8");
		 request.setCharacterEncoding("utf-8");
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println("u="+userName);
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/studb","root","admin");
			Statement sta=(Statement) con.createStatement();
			
			int i=sta.executeUpdate("insert denglu(name, pwd) values('"+userName+"','"+password+"')");
			if(i>0){
				request.getRequestDispatcher("sa").forward(request,response);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
//		String userName = request.getParameter("userName");
//		String password = request.getParameter("password");
//		
//		String url="jdbc:mysql://localhost:3306/studb";
//		Connection con;
//		try {
//			con = (Connection) DriverManager.getConnection(url, "root", "admin");
//			Statement sta = (Statement) con.createStatement();
//			request.getAttribute(userName);
//			request.getAttribute(password);
//			String sql="insert denglu values('"+userName+"','"+password+"')";
//			sta.executeUpdate(sql);
//			request.getRequestDispatcher("sa").forward(request,response);
//			int i=sta.executeUpdate(sql);
//			request.setAttribute("name", userName);
//			request.setAttribute("pwd", password);
			
//			if(i>0){
//				request.getRequestDispatcher("sa").forward(request,response);
//			}else{
//				request.getRequestDispatcher("sa").forward(request,response);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
