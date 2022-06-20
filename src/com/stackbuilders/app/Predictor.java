package com.stackbuilders.app;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.PicoPlacaDAO;
import com.stackbuilders.dao.QueryDAO;
import com.stackbuilders.dao.ScheduleDAO;
import com.stackbuilders.entity.PicoPlaca;
import com.stackbuilders.entity.Query;

public class Predictor {
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PicoPlacaDAO picoPlacaDAO = DAOFactory.getFactory().getPicoPlacaDAO();
		ScheduleDAO scheduleDAO = DAOFactory.getFactory().getScheduleDAO();
		QueryDAO queryDAO = DAOFactory.getFactory().getQueryDAO();
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		
		List<PicoPlaca> rules = picoPlacaDAO.generatePicoPlacaRules();
				
		
		Query query = new Query();
	
		Scanner userInput = new Scanner(System.in);
		System.out.println("   	Pico y Placa Predictor");
		System.out.println("	Please enter your plate number: ");
		query.setPlateNumber(userInput.nextLine());
		System.out.println("	Please enter a date and hour in the following format dd-mm-yyyy HH:mm, Example: 20-06-2022 08:14");
		LocalDateTime dateTime = LocalDateTime.parse(userInput.nextLine(), formatter);
		query.setDateHour(dateTime);
		System.out.println(query.toString());
		
		
		
		
	}
	
	
}
