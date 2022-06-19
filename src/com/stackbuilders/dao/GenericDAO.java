package com.stackbuilders.dao;

public interface GenericDAO<T, ID> {
	
	String checkPicoPlaca(T entity);
}
