package com.stackbuilders.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.stackbuilders.dao.DAOFactory;
import com.stackbuilders.dao.ScheduleDAO;
import com.stackbuilders.entity.Schedule;

public class ScheduleTest {
	
	ScheduleDAO scheduleDAO = DAOFactory.getFactory().getScheduleDAO();
	
	@Test
	public void testGeneratedMorningHourRange() {
		Schedule expected = new Schedule("07:00", "09:30");
		Schedule actual = scheduleDAO.generateMorningHourRange();
		Assertions.assertEquals(expected.getStartingHour(), actual.getStartingHour());
		
	}
	
	@Test
	public void testGeneratedNoonHourRange() {
		Schedule expected = new Schedule("16:00", "19:30");
		Schedule actual = scheduleDAO.generateNoonHourRange();
		Assertions.assertEquals(expected.getStartingHour(), actual.getStartingHour());
	}

}
