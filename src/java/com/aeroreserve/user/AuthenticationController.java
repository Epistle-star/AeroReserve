/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aeroreserve.user;

import com.aeroreserve.util.EntityManagerUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Epistle
 */
@WebServlet(name="AuthenticationController", urlPatterns={"/login", "/signup"})
public class AuthenticationController extends HttpServlet {
  
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        
        String servletPath = request.getServletPath();
		
		if(servletPath.equals("/login"))
		{
			request.getRequestDispatcher("Registration.jsp").forward(request, response);
		}
                
                if(servletPath.equals("/signup"))
		{
			request.getRequestDispatcher("Registration.jsp").forward(request, response);
		}
		else
		{
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect("login");
		}
    } 

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String servletPath = request.getServletPath();
		
	if(servletPath.equals("/login"))
	{
            String username = request.getParameter("username");
            String password = request.getParameter("password");
			
            if(username.isEmpty() || password.isEmpty())
            {
		request.setAttribute("feedback", "Username and password are required");
		request.getRequestDispatcher("Registration.jsp").forward(request, response);
		return;
            }
            
            
            UserService userService = new UserService(EntityManagerUtil.getEntityManager());
			
            User user = userService.getUser(username);
            if(user == null)
            {
		request.setAttribute("feedback", "Username and password incorrect");
		request.getRequestDispatcher("Registration.jsp").forward(request, response);
		return;
            }
            
            //password hashing
            
            
//            if(!user.getPassword().equals(password))
            if(!userService.verifyPassword(username, password))
            {
		request.setAttribute("feedback", "Username and password incorrect");
		request.getRequestDispatcher("Registration.jsp").forward(request, response);
		return;
            }
			
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
//            response.sendRedirect("/search-flights.jsp");
               request.getRequestDispatcher("search-flights.jsp").forward(request, response);
        }
        
        if(servletPath.equals("/signup")){
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            if(name.isEmpty() || email.isEmpty() || username.isEmpty() || password.isEmpty())
            {
		request.setAttribute("feedback", "All fields are required");
		request.getRequestDispatcher("Registration.jsp").forward(request, response);
		return;
            }
            
            UserService userService = 
            new UserService(EntityManagerUtil.getEntityManager());
        	User user = new User(name, username, email, password);
		
            try
            {
		userService.addUser(user);
            }
            catch (IllegalArgumentException e)
            {
		request.setAttribute("feedback", e.getMessage());
		request.getRequestDispatcher("Registration.jsp").forward(request, response);
		return;
            }
            
            HttpSession session = request.getSession();
            session.setAttribute("feedback", "Account created successfully");
            request.getRequestDispatcher("search-flights.jsp").forward(request, response);
            
        }
        
    }


}
