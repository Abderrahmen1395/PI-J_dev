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
public class Treservation {
    
    private int idReservation;
    private int nbr_personnes;
    private Date date_res;
    private int id_client;
    private int id_annonce;

    public Treservation() {
    }

    public Treservation(int idReservation, int nbr_personnes, Date date_res, int id_client, int id_annonce) {
        this.idReservation = idReservation;
        this.nbr_personnes = nbr_personnes;
        this.date_res = date_res;
        this.id_client = id_client;
        this.id_annonce = id_annonce;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public int getNbr_personnes() {
        return nbr_personnes;
    }

    public Date getDate_res() {
        return date_res;
    }

    public int getId_client() {
        return id_client;
    }

    public int getId_annonce() {
        return id_annonce;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setNbr_personnes(int nbr_personnes) {
        this.nbr_personnes = nbr_personnes;
    }

    public void setDate_res(Date date_res) {
        this.date_res = date_res;
    }

    public void setId_client(int id_client) {
        this.id_client = id_client;
    }

    public void setId_annonce(int id_annonce) {
        this.id_annonce = id_annonce;
    }
    
    
    
}
