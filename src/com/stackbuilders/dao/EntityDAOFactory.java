package com.stackbuilders.dao;

import com.stackbuilders.service.PicoPlacaService;
import com.stackbuilders.service.QueryService;
import com.stackbuilders.service.ScheduleService;

public class EntityDAOFactory extends DAOFactory{

	@Override
	public PicoPlacaDAO getPicoPlacaDAO() {
		// TODO Auto-generated method stub
		return new PicoPlacaService();
	}

	@Override
	public QueryDAO getQueryDAO() {
		// TODO Auto-generated method stub
		return new QueryService();
	}

	@Override
	public ScheduleDAO getScheduleDAO() {
		// TODO Auto-generated method stub
		return new ScheduleService();
	}

}
