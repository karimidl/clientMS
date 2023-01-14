package com.example.microserviceclient.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;


public class ClientResponseDTO {

    public int id;
    public String nom;
    public String ville;
    public String prenom;
    public int tele;
    public String email;

    public ClientResponseDTO() {
    }

    public ClientResponseDTO(int id, String nom, String ville, String prenom, int tele, String email) {
        this.id = id;
        this.nom = nom;
        this.ville = ville;
        this.prenom = prenom;
        this.tele = tele;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getTele() {
        return tele;
    }

    public void setTele(int tele) {
        this.tele = tele;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
