/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 *
 * @author pc
 */
public class Startup {
    public static void main(String ... args){
        Artist tomCruise = new Artist("Tom cruise");
        Artist michaelJackson = new Artist("Michael Jackson");
        Artist louisDeFunes = new Artist("Louis De Funes");
        
        Work minorityReport = new Work("minority report");
        Work bad = new Work("Bad");
        Work leGendarme = new Work("le gendarme de st tropez");
        
        minorityReport.setMainArtist(tomCruise);
        bad.setMainArtist(michaelJackson);
        leGendarme.setMainArtist(louisDeFunes);
        
        minorityReport.setRelease(2002);
        bad.setRelease(1987);
        leGendarme.setRelease(1964);
        
        minorityReport.setSummary("le film est le la ep vejnr cpozkj ");
        bad.setSummary("azertyuiopmlkjhgfdsqwxcvbn,");
        leGendarme.setSummary("leGendarme leGendarmeleGendarme leGendarme leGendarme leGendarme");
        
       minorityReport.setGenre("Science F");
       bad.setGenre("pop");
       leGendarme.setGenre("Comédie");
       
       Catalogue.listOfWork.add(minorityReport);
       Catalogue.listOfWork.add(bad);
       Catalogue.listOfWork.add(leGendarme);
       
        for (Work work : Catalogue.listOfWork ) {
            System.out.println(work.getTitle() + " ("+work.getRelease()+") ");
        }

       
       
        
    }
}
