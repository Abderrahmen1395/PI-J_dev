/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.projet.Entities;

import java.sql.Date;

/**
 *
 * @author samination
 */
public class Transport {
    
    
 
    private int idAnnonce;
    private String nomPos;
    private Date date_ajout;
    private String description;
    private float  prix;
    private String etat;

    public Transport(int idAnnonce, float prix) {
        this.idAnnonce = idAnnonce;
        this.prix = prix;
    }

    public Transport() {
    }

    public Transport(int idAnnonce, String nomPos, Date date_ajout, String description, float prix, String etat) {
        this.idAnnonce = idAnnonce;
        this.nomPos = nomPos;
        this.date_ajout = date_ajout;
        this.description = description;
        this.prix = prix;
        this.etat = etat;
    }

    public int getIdAnnonce() {
        return idAnnonce;
    }

    public String getNomPos() {
        return nomPos;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public String getDescription() {
        return description;
    }

    public float getPrix() {
        return prix;
    }

    public String getEtat() {
        return etat;
    }

    public void setIdAnnonce(int idAnnonce) {
        this.idAnnonce = idAnnonce;
    }

    public void setNomPos(String nomPos) {
        this.nomPos = nomPos;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    
    
}

    