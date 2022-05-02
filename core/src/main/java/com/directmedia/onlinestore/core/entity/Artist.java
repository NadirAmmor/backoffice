/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.core.entity;

/**
 *
 * @author pc
 */
public class Artist {
  private  String nomArtist;

    public Artist(String nomArtist) {
        this.nomArtist = nomArtist;
    }

    public String getNomArtist() {
        return nomArtist;
    }

    public void setNomArtist(String nomArtist) {
        this.nomArtist = nomArtist;
    }

}
