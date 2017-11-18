package dev.pizzeriaAPI.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.util.StringUtils;

@Entity
@Table(name="pizza")
public class Pizza implements Serializable{
	/** Identifiant de la pizza */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	@Column(name ="code")
	protected String code;
	/** Nom de la pizza */
	@Column(name ="name")
	protected String nom;
	/** Prix de la pizza */
	@Column(name ="prix")
	protected double prix;
	
	/** Id de categorie de la pizza */
	@Column(name="categorie")
	protected String categorie;
	
	/** Constructeur 
	 * @param code code
	 * @param nom nom
	 * @param prix prix
	 * */
	public Pizza(){}
	
	public Pizza(String code, String nom, double prix, String categorie) {
		this.code = code.toUpperCase();
		this.nom = nom;
		this.prix = prix;
		this.categorie = categorie;
	}
	
	/** Getters and setters */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code.toUpperCase();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}

	/**
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	
}
