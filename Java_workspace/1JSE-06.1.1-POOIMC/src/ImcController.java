
public class ImcController {
	public static void main(String []args) {	
		
		Imc ImcList []= {
				new Imc("Zainab",56, 166),
				new Imc("Alexis",65, 176),
				new Imc("Samy",120, 180),
				new Imc("Kamel")
				
		};
		for (Imc c: ImcList) {
			c.calImc();
			System.out.println(c );
		}
	}
}


