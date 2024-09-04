import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Cities cities = new Cities();
	cities.addCity("Kabol");
	cities.addDept(06, "Alpes Maritimes");
	cities.addCity("London");
	cities.addDept(75, "Ile de France");
	cities.addCity("Istanbul");
	cities.addDept(13, "Cote d'azure");
	
	
	
	cities.listCities();
	cities.listDepts();

	
	
	}
}
