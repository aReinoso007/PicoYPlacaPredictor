package com.stackbuilders.dao;

import java.util.List;

import com.stackbuilders.entity.Query;
import com.stackbuilders.entity.Schedule;

public interface QueryDAO extends GenericDAO<Query, Integer>{
	
	String checkPicoYPlaca(Query query);
	String getLastDigit(String plateNumber);
	Boolean validatePlateNumber(String plateNumber);
	Boolean isNumeric(String subStr);
	Boolean checkIfHourIsWithinRange(List<Schedule> schedules, String hourInput);
}
