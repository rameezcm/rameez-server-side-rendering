package com.rameez.rameezserversiderendering.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class SSRController {

	@RequestMapping("/")
	public String welcomePage(final Model model) {
		return "welcome";
	}

	@RequestMapping("/rameez/count/{county}")
	public String getCovidCountForCountry(final Model model ,@PathVariable(name = "country") String county) {
		return "index";
	}
}
