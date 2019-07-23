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
public class Login implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotBlank(message = "Username obrigatório")
	@NotNull
	@Size(min = 6, message = "Username precisa ter no mínimo 6 digitos")
	private String username;
	
	@NotBlank(message = "A senha não pode ficar em branco")
	@NotNull
	@Size(min = 6, message = "Senha precisa ter no mínimo 6 digitos")
	private String senha;
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Usuario usuario;
		
	public Login() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
		
}
