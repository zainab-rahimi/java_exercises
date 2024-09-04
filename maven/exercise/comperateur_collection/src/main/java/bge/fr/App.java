package bge.fr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ArrayList<Cercle>  listeCercles  = new ArrayList<Cercle>();
        Cercle c1 = new Cercle(2, 5, 4.3);
        listeCercles.add(c1);

        Cercle c2 = new Cercle(3, 2, 1.2);
        listeCercles.add(c2);

        Cercle c3 = new Cercle(3, 4, 2.1);
        listeCercles.add(c3);
        
        // we compare using the class comprateur 
        Collections.sort(listeCercles,new ComparateurCercle()); 

        for (Cercle c :listeCercles)
            c.affiche();

        Collections.sort(listeCercles,new Comparator<Cercle>() {
            public int compare(Cercle c1, Cercle c2)
            {
                int x1 = c1.getX();
                int x2 = c2.getX();

                if (x1 < x2)
                    return -1;
                else if (x1 == x2)
                    return 0;
                else
                    return 1;

                    
            }
            
        });

    
    }
}
