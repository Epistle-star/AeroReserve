/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.aeroreserve.user;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Epistle
 */
@WebServlet(name="LocationController", urlPatterns={"/Registration", "/homePage"})
public class LocationController extends HttpServlet {
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        String servlethPath  = request.getServletPath();
        
        if(servlethPath.equals("/Registration")){
            request.getRequestDispatcher("Registration.jsp").forward(request, response);
        }
        if(servlethPath.equals("/homePage")){
            request.getRequestDispatcher("homepage2.jsp").forward(request, response);
        }
    } 
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    }


}
