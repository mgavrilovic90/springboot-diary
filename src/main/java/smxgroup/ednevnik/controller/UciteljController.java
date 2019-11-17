package smxgroup.ednevnik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UciteljController {

	@GetMapping("/ucitelj")
	public String showUciteljPage() {
		return "ucitelj-page";
	}
}
