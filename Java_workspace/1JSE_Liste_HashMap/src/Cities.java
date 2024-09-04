
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cities {

	List <String> cities = new ArrayList<String> ();
	Map<Integer, String> deps = new HashMap<> ();
	
	public void addCity(String name) {
		cities.add(name);
	}
	
	public void removeCity(String name) {
		cities.remove(name);
	}
	
	public void listCities() {
		System.out.println("The list of cities: ");
		
		cities.forEach((name) -> {System.out.println(name);} );  // lambda , we use forEach() method
	}
	
	public void addDept(int key, String dept) {
		deps.put(key,dept);
	}
	
	public void removeDept(int key) {
		System.out.println("the department has been deleted" + deps.values());
		deps.remove(key);
	}
	
	public void listDepts() {
		deps.forEach((depName, depCode) -> { System.out.println(depName+ " = " + depCode); }); //Lambda to print 
		for(int key: deps.keySet()) {
			System.out.println(key  + " = " + deps.get(key));
		}
	}

}
