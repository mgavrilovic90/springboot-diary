package smxgroup.ednevnik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import smxgroup.ednevnik.entity.Uloga;
import smxgroup.ednevnik.repository.ProbaRepository;

@Controller
public class ProbaController {

	@Autowired
	private ProbaRepository repository;
	
	
	@GetMapping("/proba")
	public String showProba(Model model) {
		Uloga u = repository.findById(1).get();
		model.addAttribute("uloga",u);
		return "proba";
	}
}
