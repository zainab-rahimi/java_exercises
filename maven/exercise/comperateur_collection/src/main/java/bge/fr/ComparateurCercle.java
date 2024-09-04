package bge.fr;

import java.util.Comparator;

public class ComparateurCercle implements Comparator{
    public int compare (Object o1, Object o2){
        Cercle c1 = (Cercle)o1;
        Cercle c2 = (Cercle)o2;

        double r1 = c1.getRayon();
        double r2 = c2.getRayon();

        if (r1 < r2)
            return -1;
        else if (r1 == r2)
            return 0;
        else 
            return +1;
    }
}
