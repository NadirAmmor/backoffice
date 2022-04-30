/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(name = "WorkAddedSuccessServlet", urlPatterns = {"/addwork-success"})
public class WorkAddedSuccessServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            PrintWriter out = response.getWriter();
    response.setContentType("text/html");
     
    out.print("<html> <body> L'oeuvre à bien été ajoute son identifiant est:" + request.getAttribute("identifiantOeuvre") + "<br> <a href=\"home.jsp\"> Page d'acceuil </a></body> </html>");
            
      
    }


}
