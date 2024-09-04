package bge.fr;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class HashMapdemo{
   
    /**
     * @param args
     * @param key 
     */
    public static void main(String[] args, String key) {
        /* Déclaration du HashMap persAge */

        HashMap<String, Integer> persAge = new HashMap<String, Integer>();

        /* Ajouter des entrées dans le HashMap persAge */
        persAge.put(key:"Mélisande",value: 28);   
        persAge.put(key:"Carine",value: 33);
        persAge.put(key:"Paul",value; 45);

        System.out.println("Melisade a "+ persAge.get(key: "Mélisande")+ "ans");
        Set pairs = persAge.entrySet();

        

    }
}
