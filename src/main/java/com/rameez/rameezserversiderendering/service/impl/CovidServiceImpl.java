package com.rameez.rameezserversiderendering.service.impl;

import com.rameez.rameezserversiderendering.model.CovidModel;
import com.rameez.rameezserversiderendering.service.CovidService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

@Service
public class CovidServiceImpl implements CovidService{

	@Value("${single.country.api}")
	private String singleCountry ;
	@Value("${all.country.api}")
	private String allCountries;

	@Override
	public List<Mono<CovidModel>> getCovidCount(String county) {
		List<Mono<CovidModel>> result = new ArrayList<>();
		result.add(getCount(county));
		return result;
	}

	@Override
	public Flux<CovidModel> getAllCountries() {
		WebClient allCountryclient = WebClient.create(allCountries);
		Flux<CovidModel> flux = allCountryclient.get()
				.uri("count")
				.accept(MediaType.ALL)
				.retrieve()
				.bodyToFlux(CovidModel.class);
		return flux;
	}

	Mono<CovidModel> getCount(String country) {
		WebClient singleCountryclient = WebClient.create(singleCountry);
		return singleCountryclient.get().uri(country).accept(MediaType.APPLICATION_JSON)
				.retrieve().bodyToMono(CovidModel.class);
	}

}
