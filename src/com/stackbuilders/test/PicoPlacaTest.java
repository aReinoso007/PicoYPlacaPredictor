package com.stackbuilders.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;

public class PicoPlacaTest {
	
	PicoPlacaDAO picoPlacaDAO = DAOFactory.getFactory().getPicoPlacaDAO();
	
	@Test
	public void testArraySize() {
		int exptected = 5;
		int actual = picoPlacaDAO.generatePicoPlacaRules().size();
		Assertions.assertEquals(exptected, actual);
	}
	
}
