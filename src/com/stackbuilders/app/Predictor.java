package com.stackbuilders.app;


import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;
import com.stackbuilders.dao.QueryDAO;
import com.stackbuilders.dao.ScheduleDAO;
import com.stackbuilders.service.PicoPlacaService;
import com.stackbuilders.service.ScheduleService;

public class Predictor {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PicoPlacaDAO picoPlacaDAO = DAOFactory.getFactory().getPicoPlacaDAO();
		ScheduleDAO scheduleDAO = DAOFactory.getFactory().getScheduleDAO();
		QueryDAO queryDAO = DAOFactory.getFactory().getQueryDAO();
			
		
	}
	
	
}
