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

/**
 *
 * @author pc
 */
@WebServlet(name = "AuthentificationServlet", urlPatterns = {"/login"})
public class AuthentificationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
            String login =request.getParameter("login");
            String password = request.getParameter("password");                    
            if((login.equals("michel") && password.equals("123456")) || (login.equals("caroline")&& password.equals("abcdef")))
            {
            out.print("<html><body>");
            out.print("<a href=\"home.jsp\"> Catalogue des Oeuvres </a>");
            out.print("</body></html>");
            HttpSession session =request.getSession();
            session.setAttribute("login", login);

            }
            else out.print("<html><body>login / mdp erroné<br> <a href=\"http://localhost:8081/backoffice/login.html\"> retour a la page d'authentification </a>\" </body> </html>");
    }

}
