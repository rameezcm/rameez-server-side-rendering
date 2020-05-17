package com.rameez.rameezserversiderendering.service;

import com.rameez.rameezserversiderendering.model.CovidModel;
import com.rameez.rameezserversiderendering.model.Example;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface CovidService {
	List<Mono<Example>> getCovidCount(String county);
	 Flux<CovidModel> getAllCountries();
}
