package com.stackbuilders.app;


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
import com.stackbuilders.entity.Schedule;

public class Predictor {
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PicoPlacaDAO picoPlacaDAO = DAOFactory.getFactory().getPicoPlacaDAO();
		QueryDAO queryDAO = DAOFactory.getFactory().getQueryDAO();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		List<PicoPlaca> rules = picoPlacaDAO.generatePicoPlacaRules();
		
		Predictor pr = new Predictor();
		
		Query query = new Query();
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("Pico y Placa Predictor");
		System.out.println("Please enter your plate number: ");
		query.setPlateNumber(userInput.nextLine());
		System.out.println("Please enter a date and hour in the following format dd-mm-yyyy HH:mm, Example: 20-06-2022 08:14");
		LocalDateTime dateTime = LocalDateTime.parse(userInput.nextLine(), formatter);
		query.setDateHour(dateTime);
		System.out.println(queryDAO.checkPicoYPlaca(query));

		
		for(int i=0; i<rules.size(); i++) {
			System.out.println(rules.get(i).toString());
		}
	}
	
	
}
