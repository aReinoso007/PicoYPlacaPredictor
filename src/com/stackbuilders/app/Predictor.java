package com.stackbuilders.app;


import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;
import com.stackbuilders.dao.QueryDAO;
import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Query;

public class Predictor {
	
	public void checkifPicoYPlacaApllies() {
		QueryDAO queryDAO = DAOFactory.getFactory().getQueryDAO();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String date = "", hour = "";
		Query query = new Query();
		try {
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		System.out.println("***Pico y Placa Predictor***");
		System.out.println("Please enter your plate number: ");
		query.setPlateNumber(userInput.nextLine());
		System.out.println("Please enter a date in the following format dd-mm-yyyy, Example: 20-06-2022");
		date = userInput.nextLine();
		System.out.println("Please enter a hour in the following format HH:mm, Example: 08:14");
		hour = userInput.nextLine();
		LocalDateTime dateTime = LocalDateTime.parse(date+" "+hour, formatter);
		query.setDateHour(dateTime);
		System.out.println(queryDAO.checkPicoYPlaca(query));
		checkifPicoYPlacaApllies();
		}catch(DateTimeException e) {
			System.out.println("Please enter a valid date");
			checkifPicoYPlacaApllies();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PicoPlacaDAO picoPlacaDAO = DAOFactory.getFactory().getPicoPlacaDAO();
		
		
		
		
		List<PicoPlaca> rules = picoPlacaDAO.generatePicoPlacaRules();
		
		Predictor pr = new Predictor();
		
		pr.checkifPicoYPlacaApllies();
		
	}
	
	
}
