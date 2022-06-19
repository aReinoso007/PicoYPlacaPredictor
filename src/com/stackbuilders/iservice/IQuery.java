package com.stackbuilders.iservice;

import com.stackbuilders.entity.Query;
import com.stackbuilders.entity.Schedule;

public interface IQuery {
	
	String processQuery(Query query, Schedule schedule);

}
