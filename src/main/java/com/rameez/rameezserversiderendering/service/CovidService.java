package com.rameez.rameezserversiderendering.service;

import com.rameez.rameezserversiderendering.model.CovidModel;

public interface CovidService {	
	 CovidModel getCovidCount(String county);
}
