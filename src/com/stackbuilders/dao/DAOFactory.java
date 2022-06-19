package com.stackbuilders.dao;

public abstract class DAOFactory {
	
	protected static DAOFactory factory = new EntityDAOFactory();
	
	public static DAOFactory getFactory() {
		return factory;
	}
	
	public abstract PicoPlacaDAO getPicoPlacaDAO();
	public abstract QueryDAO getQueryDAO();
	public abstract ScheduleDAO getScheduleDAO();
}
