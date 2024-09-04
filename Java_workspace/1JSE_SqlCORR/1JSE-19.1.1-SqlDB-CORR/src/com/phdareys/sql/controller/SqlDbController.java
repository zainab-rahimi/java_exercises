


package com.phdareys.sql.controller;


import com.phdareys.sql.bean.Actor;
import com.phdareys.sql.dao.ActorDAO;
import com.phdareys.sql.dao.Dao;
import com.phdareys.sql.dao.EmployeeDao;
import com.phdareys.sql.exception.DbsqlException;

public class SqlDbController {

	public static void main(String[] args) {
		//EmployeeDao empDao = new EmployeeDao();
		ActorDAO actorDao = new ActorDAO();
		try {
			actorDao.add(new Actor("DiCaprio", "US"));
			System.out.println ("Actor ins�r�!");	// lecture tous les employ�s
			
		} catch (DbsqlException e) {
			System.out.println (e.getMessage());
		}
		finally {
			Dao.closeInstance();
		}
		

	}
}
