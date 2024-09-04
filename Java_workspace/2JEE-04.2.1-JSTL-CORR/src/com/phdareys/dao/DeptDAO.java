package com.phdareys.dao;
import java.util.HashMap;
import java.util.Map;

public class DeptDAO {
	public Map<Integer, String> get() {
		Map<Integer, String> depts = new HashMap<Integer, String>();
		depts.put(31, "Haute Garonne");
		depts.put(13, "Bouches du Rhône");
		depts.put(75, "Paris");		
		return depts;
	}

}
