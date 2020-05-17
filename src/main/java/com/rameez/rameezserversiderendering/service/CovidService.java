package com.rameez.rameezserversiderendering.service;

import com.rameez.rameezserversiderendering.model.CovidModel;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CovidService {
	List<Mono<CovidModel>> getCovidCount(String county);
	 Flux<CovidModel> getAllCountries();
}
