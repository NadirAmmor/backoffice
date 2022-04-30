/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pc
 */
@WebServlet(name = "AddWorkServlet", urlPatterns = {"/add-work"})
public class AddWorkServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean success = true;
         Work nouvelleOeuvre = new Work(request.getParameter("titre"));
         nouvelleOeuvre.setGenre(request.getParameter("genre"));
         try{
         nouvelleOeuvre.setRelease(Integer.parseInt(request.getParameter("annee")));
         }catch(NumberFormatException nfe){
             success = false;
             
         }
         nouvelleOeuvre.setSummary(request.getParameter("resume"));
         nouvelleOeuvre.setMainArtist(new Artist(request.getParameter("artiste")));
      
         /**
          * traditionnal way
          * 
          * for(Work work : Catalogue.listOfWork){
         if(work.getTitle().equals(nouvelleOeuvre.getTitle())&& work.getRelease()==nouvelleOeuvre.getRelease() && work.getMainArtist().getNomArtist().equals(nouvelleOeuvre.getMainArtist().getNomArtist())){
             success=false;
         
         }
                 
             
         }
          */
         
         /**
          * API STREAM
          */
        
           Optional<Work> optionalWork =Catalogue.listOfWork.stream().filter(work -> work.getTitle().equals(nouvelleOeuvre.getTitle())&& work.getRelease()==nouvelleOeuvre.getRelease() && work.getMainArtist().getNomArtist().equals(nouvelleOeuvre.getMainArtist().getNomArtist())).findAny();
    if(optionalWork.isPresent()){
        success=false;
    }
    
         
         
         
         
         if(success){
         Catalogue.listOfWork.add(nouvelleOeuvre);
         /**
          *      RequestDispatcher disp = request.getRequestDispatcher("/addwork-success");
         disp.forward(request, response);
         
          */
        request.setAttribute("identifiantOeuvre", nouvelleOeuvre.getId());
         request.getRequestDispatcher("/addwork-success").forward(request, response);
         
        }
         else{
         request.getRequestDispatcher("/addwork-fail").forward(request, response);
         
         }
         
    }
        }