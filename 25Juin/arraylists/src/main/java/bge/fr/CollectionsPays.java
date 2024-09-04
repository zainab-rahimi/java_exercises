package bge.fr;

import java.util.ArrayList;
import java.util.Collections;



/**
 * Hello world!
 *
 */
public class CollectionsPays 
{ 
    public static void affichage (ArrayList<String> list){
        if (!list.isEmpty()){
            for (int position = 0; position < list.size(); position++ )
            {
                System.out.println(list.get(position));
            }

        }else
        System.out.println("liste vide");


    } 

    public static void main( String[] args )
    {
        

        ArrayList<String> pays = new ArrayList<String>();
        pays.add("France");
        pays.add("Allemand");
        pays.add("USA");
        pays.add("Chine");

        System.out.println("la collection contain "+ pays.size()+ " pays");

        // Question b
        affichage(pays);

        // question c 
        pays.clear();
        affichage(pays);

        // question d 
        pays.add("France");

        pays.remove("Chine");
        pays.add("Thaiwan");

        affichage(pays);

        String unPaysDansCollection = "France";
        String unPaysPasDansCollection = "Bolivie";

        if (pays.contains(unPaysDansCollection))
        System.out.println("le pays "+ unPaysDansCollection+ "  \nblabala");
        else
        System.out.println("le payss"+ unPaysPasDansCollection+ " is not in the pays list");

        // Question f

        Collections.sort(pays);
        affichage(pays);

        Collections.reverse(pays);
        affichage(pays);

    }
}
