package com.br.tamagotchi.models;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Pet implements Serializable{
	public static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@NotBlank(message = "Nome do pet é obrigatório")
	@Size(min = 2, message = "O nome do seu pet precisa ter pelo menos 2 letras")
	private String nomePet;
	
	private int fome = 0;
	private int xpPet = 0;
	private int levelPet = 0;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Usuario usuario;

	public Pet() {
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public int getFome() {
		return fome;
	}
	public void setFome(int fome) {
		this.fome = fome;
	}
	public int getXpPet() {
		return xpPet;
	}
	public void setXpPet(int xpPet) {
		this.xpPet = xpPet;
	}
	public int getLevelPet() {
		return levelPet;
	}
	public void setLevelPet(int levelPet) {
		this.levelPet = levelPet;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
