package com.rameez.rameezserversiderendering.controller;

import com.rameez.rameezserversiderendering.model.CovidModel;
import com.rameez.rameezserversiderendering.service.CovidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;
import reactor.core.publisher.Flux;

@Controller
public class SSRController {

	@Autowired
	private CovidService covidService;

	@RequestMapping("/")
	public String welcomePage(final Model model) {
		int elementsOfFluxInSseChunk = 1;
		Flux<CovidModel> covidList = covidService.getAllCountries();
		model.addAttribute("covids", new ReactiveDataDriverContextVariable(
				covidList,
				elementsOfFluxInSseChunk));
		return "welcome";
	}

	@RequestMapping("/rameez/count/{country}")
	public String getCovidCountForCountry(final Model model ,@PathVariable(name = "country") String county) {
		int elementsOfFluxInSseChunk = 1;
		model.addAttribute("covids", new ReactiveDataDriverContextVariable(
				Flux.concat(covidService.getCovidCount(county)),
				elementsOfFluxInSseChunk));
		return "welcome";
	}
}
