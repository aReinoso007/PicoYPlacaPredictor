package com.stackbuilders.service;

import java.util.List;

import com.stackbuilders.entity.PicoPlaca;
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
		List<PicoPlaca> scheduledRules = picoPlacaService.generatePicoPlacaRules();
		return null;
	}

	@Override
	public String getLastDigit(String plateNumber) {
		if(validatePlateNumber(plateNumber)) {
			return plateNumber.substring(6,7);
		}else {
			return null;
		}
	}

	@Override
	public Boolean validatePlateNumber(String plateNumber) {
		
		return (!isNumeric(plateNumber.substring(0, 3)) && plateNumber.length() < 8 ? true: false);
	}
	
	private boolean isNumeric(String subStr) {
		if(subStr == null) {
			return false;
		}
		try {
			double check = Double.parseDouble(subStr);
		}catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

}
