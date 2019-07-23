package com.br.tamagotchi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.tamagotchi.models.Login;
import com.br.tamagotchi.models.Pet;
import com.br.tamagotchi.models.Usuario;
import com.br.tamagotchi.repositories.LoginRepository;

@Service
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public String cadastrarLogin(Usuario usuario, Login login, Pet pet) {
		login.setUsuario(usuario);
		loginRepository.save(login);
		return "Cadastro realizado com sucesso";
	}
	
	public Login buscarLogin(Login login) {
		return loginRepository.findByUsernameAndSenha(login.getUsername(), login.getSenha()).get();
	}

}
