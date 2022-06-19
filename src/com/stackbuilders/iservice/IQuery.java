package com.stackbuilders.iservice;

import com.stackbuilders.entity.Query;

public interface IQuery {
	
	String checkPicoYPlaca(Query query);
	
	Boolean validatePlateNumber(String plateNumber);
	
	String getLastDigit(String plateNumber);
	
}