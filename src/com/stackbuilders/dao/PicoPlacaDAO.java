package com.stackbuilders.dao;

import java.util.List;

import com.stackbuilders.entity.PicoPlaca;

public interface PicoPlacaDAO extends GenericDAO<PicoPlaca, Integer>{
	
	List<PicoPlaca> generatePicoPlacaRules();
	
}
