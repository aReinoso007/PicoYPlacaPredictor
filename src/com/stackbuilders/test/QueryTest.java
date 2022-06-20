package com.stackbuilders.test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.*;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.QueryDAO;
import com.stackbuilders.entity.Query;

public class QueryTest {
	
	QueryDAO queryDAO = DAOFactory.getFactory().getQueryDAO();
	
	@Test
	public void testGetLastDigit() {
		
		Query query = new Query();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		query.setPlateNumber("ABC-123");
		query.setDateHour(LocalDateTime.parse("21-06-2022 08:01",formatter));
		
		String expectedDigit = "3";
		String actual = queryDAO.getLastDigit(query.getPlateNumber());
		Assertions.assertEquals(expectedDigit, actual);
	}
	
	@Test
	public void testIsNumericTrue() {
		boolean expected = true;
		String numericTest ="123";
		boolean actual = queryDAO.isNumeric(numericTest);
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testIsNumericFalse() {
		boolean expected = false;
		String numericTest ="ABC";
		boolean actual = queryDAO.isNumeric(numericTest);
		Assertions.assertEquals(expected, actual);
	}

}
