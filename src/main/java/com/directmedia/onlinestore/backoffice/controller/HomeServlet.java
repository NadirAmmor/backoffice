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
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


/**
 *
 * @author pc
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  PrintWriter out = response.getWriter();
          out.print("<html> <body> <H1>Bonjour servlet back office,<br> OnlineStore, votre boutique multimédia en ligne</H1> <br>");
          out.print("Bonjour " + request.getSession().getAttribute("login")+ "<a href=\"http://localhost:8081/backoffice/logout\"> (Déconnexion) </a>" +"<br>");
          out.print("<a href=\"add-work-form.html\"> Ajouter des Ouevres</a>");
          out.print("<br>");
          out.print("<a href=\"catalogue\"> Catalogue des Oeuvres </a>");
          out.print(" </body></html>");      
    }

}
