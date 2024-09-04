package fr.bge;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    
        pokemon p1 = new pokemon();
        p1.name = "Zainab pichaccu";
        p1.level = 30;

        pokemon my_pokemon = new pokemon();
        my_pokemon.name = "zainab_pokemon";
        my_pokemon.level = 32; 
        
        my_pokemon.attack();

        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto:" + t1.toto);
    }
}

