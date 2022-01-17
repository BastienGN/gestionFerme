package com.inti.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAnimal;

	@ManyToOne
	private Ferme ferme;

	public Animal() {

	}

	public Animal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public Long getIdAnimal() {
		return idAnimal;
	}

	public void setIdAnimal(Long idAnimal) {
		this.idAnimal = idAnimal;
	}

	public Ferme getFerme() {
		return ferme;
	}

	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}

}
