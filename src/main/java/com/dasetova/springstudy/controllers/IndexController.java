package com.dasetova.springstudy.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller identifica esta clase como un controlador de Spring
@Controller
public class IndexController {
	
	@Value("${application.controller.title}")
	private String title;
	
	//Model permite pasar atributos a la vista
	//Retorna la vista
	//GetMapping establece que permite un metodo GET
	//Tambien se puede usar RequestMapping especificando el metodo GET
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("title", this.title);
		return "index";
	}
}
