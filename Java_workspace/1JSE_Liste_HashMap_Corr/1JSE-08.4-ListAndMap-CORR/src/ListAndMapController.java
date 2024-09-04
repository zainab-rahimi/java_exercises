import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListAndMapController {
	List<String> cities = new ArrayList<String> ();	// instantiation obligatoire!
	Map<Integer, String> depts = new HashMap<Integer, String>(); // instantiation obligatoire!
	
	public static void main(String[] args) {
		ListAndMapController obj = new ListAndMapController();	// instance
			// 1/ liste
		obj.addCity("Toulouse");
		obj.addCity("Paris");
		obj.addCity("Nice");
		obj.listCities();
		obj.removeCity("Paris");
		obj.listCities();
			// 2/ annuaire
		obj.addDept(31, "Toulouse");
		obj.addDept(13, "Marseille");
		obj.addDept(06, "Nice");
		obj.listDept();
		obj.removeDept(13);
		obj.listDept();
		
	}
	public void addCity(String name) {
		cities.add(name);
	}
	public void removeCity(String name) {
		System.out.println(" Delete: "+name);
		cities.remove(name);
	}
	public void listCities() {
		System.out.println("-> Liste de Villes: ");
//		for (String c :cities)
//			System.out.println(c);
		// lambda
		cities.forEach(c->{System.out.println(c);});
	}
	
	public void addDept(int num, String city) {
		depts.put(num,  city);
	}
	public void removeDept(int num) {
		System.out.println(" Delete: "+num);
		depts.remove(num);
	}
	public void listDept() {
		System.out.println("-> Liste de Depts: ");
			// expression lambda
		//depts.forEach((key, value) -> { System.out.println(key + " = " + value); });
			// classique
		for (int num : depts.keySet())	// toutes les clés!
			System.out.println(num + " = " + depts.get(num)); 
	}

	
}

