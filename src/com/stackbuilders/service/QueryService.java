package com.stackbuilders.service;

import com.stackbuilders.entity.Query;
import com.stackbuilders.iservice.IPicoPlaca;
import com.stackbuilders.iservice.IQuery;

public class QueryService implements IQuery{
	
	
	private final IPicoPlaca picoPlacaService;
	
	public QueryService(IPicoPlaca picoPlacaService) {
		this.picoPlacaService = picoPlacaService;
	}

	@Override
	public String checkPicoYPlaca(Query query) {
		// TODO Auto-generated method stub
		return null;
	}

}
