package fr.bge;

public class pokemon {

    String name;
    int level; 

    // this is called a constructer to set a default value
    pokemon() {
        level = 10;
    }

    void attack(){
        System.out.println(name + " attack");
    }

}
