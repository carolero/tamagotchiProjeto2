package com.br.tamagotchi.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.br.tamagotchi.models.Login;
import com.br.tamagotchi.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/")
	public ModelAndView exibirFormLogin() {
		ModelAndView modelAndView = new ModelAndView("login.html");
		return modelAndView;
	}
	
//	@PostMapping("/")
//	public ModelAndView logar(Login login, HttpSession session) {
//		ModelAndView modelAndView = null;
//		Login objetoLogin = loginService.buscarLogin(login);
//		if(objetoLogin != null) {
//			session.setAttribute("usuario", objetoLogin.getUsuario());
//			String saudacao = "Olá " + objetoLogin.getUsuario().getNome() + "! Seja bem vindo.";
//			modelAndView.addObject("mensagens", saudacao);
//		}
//	}

}
