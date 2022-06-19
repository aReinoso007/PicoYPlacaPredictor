package com.stackbuilders.dao;

import com.stackbuilders.entity.Query;

public interface QueryDAO extends GenericDAO<Query, Integer>{
	
	String checkPicoYPlaca(Query query);
	Boolean validatePlateNumber(String plateNumber);
	String getLastDigit(String plateNumber);

}