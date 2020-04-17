package com.fali.entites;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Commande implements Serializable {
	
	@Id
	@GeneratedValue
	private Long id ;
	private String nameCommande;
	private double prixCommande;
	private String designation;
	
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(String nameCommande, double prixCommande, String designation) {
		super();
		this.nameCommande = nameCommande;
		this.prixCommande = prixCommande;
		this.designation = designation;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameCommande() {
		return nameCommande;
	}
	public void setNameCommande(String nameCommande) {
		this.nameCommande = nameCommande;
	}
	public double getPrixCommande() {
		return prixCommande;
	}
	public void setPrixCommande(double prixCommande) {
		this.prixCommande = prixCommande;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
