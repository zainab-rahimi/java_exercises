
public class PersonImcController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonImc persons[] = {	// tableau de personnes dont on calcule l'IMC
				new PersonImc("Djokovic"),
				new PersonImc("Paul", 190),
				new PersonImc("PilierAustralien", 135, 185),
				new PersonImc("ChampionneDEscalade", 45, 160),				
		};
		for (PersonImc p: persons) {
			p.exec();
			System.out.println(p);	// appel de ToString!!!
		}
	
	}

}
