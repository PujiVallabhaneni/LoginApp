package com.pujitha.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pujitha.login.dto.User;

/**
 * Servlet implementation class LoginService
 */
@WebServlet("/LoginService")
public class LoginService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userName, password;
		userName=request.getParameter("userName");
		password=request.getParameter("password");
		//HttpSession session=request.getSession();
		//session.setAttribute("sessionUsername",userName);
		
		LoginAuth loginAuth=new LoginAuth();
		
		boolean result=loginAuth.validate(userName, password);
		if (result==true)
		{
			User user = loginAuth.getUserDetails(userName);
			//request.getSession().setAttribute("user", user);
			request.setAttribute("user", user);
			RequestDispatcher dispatcher = request.getRequestDispatcher("success.jsp");
			dispatcher.forward(request, response);
			//response.sendRedirect("success.jsp");
		}
		else
			response.sendRedirect("login.jsp");
}
}
