package com.phdareys.controller;
import com.phdareys.model.Animal;
import com.phdareys.model.Light;
import com.phdareys.model.Shape;
import com.phdareys.model.Young;

public class EnumController {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for (Young y: Young.values())
		Young y;
		y=Young.JUNIOR;
		y.display();
		y=Young.POUSSIN;
		y.display();
		// autre exemple, calcul du p�rim�tre pour 2 formes!!!
		for (Shape s: Shape.values())
			System.out.println (s.name() + " perim de 5: " + s.perim(5));
		for (Light l : Light.values()) {
			System.out.println("Quand le feu est: " + l + ", " + l.getAction() + 
					" (position dans la liste: " + l.ordinal() + ")");
		}
		Animal a=Animal.TIGER;
		System.out.println("nom: " + a.getName() + " logo: " + a.getLogo());
		a=Animal.BEAR;
		System.out.println("nom: " + a.getName() + " logo: " + a.getLogo());
				
	}

}
