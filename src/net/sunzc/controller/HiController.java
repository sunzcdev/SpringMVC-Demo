package net.sunzc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hi")
public class HiController {
	@RequestMapping("/say")
	public String say1() {
		return "index";
	}

	public String say2() {
		return "/index";
	}
	@RequestMapping("/say2")
	public String say(Model model){
		model.addAttribute("name","Sun");
		model.addAttribute("age",32);
		return "index";
	}
}
