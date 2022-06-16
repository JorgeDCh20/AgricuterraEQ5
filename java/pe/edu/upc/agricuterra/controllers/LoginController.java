package pe.edu.upc.agricuterra.controllers;


import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping
public class LoginController {

	@GetMapping(value = { "/login", "/" })
	public String login(@RequestParam(value = "logout", required = false) String logout, Model model, Principal principal,
	RedirectAttributes flash) {

	if (principal != null) {
	return "login/login";
	}


	if (logout != null) {
	model.addAttribute("success", "Ha cerrado sesión con éxito!");
	}

	return "login/login";
	}
		
	
}



