
1/ Tuto
But:

Il s'agit de traiter des variables du MEME TYPE rangées séquentiellement.

Déclaration: 

<type du tableau> <nom du tableau> [] [= { <contenu du tableau>}];

Ex:

String planets [] = {"Mars", "Jupiter", "Venus"}; // bonne pratique: mettre un 's'

int ints[] = {0,1,2,3,4,5,6,7,8,9};
double doubles[] = {0.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
char chars[] = {'a','b','c','d','e','f','g'};
String strings[] = {"chaine1", "chaine2", "chaine3" , "chaine4"};

Ou:

int tableauEntier[] = new int[6]; //Ou encore
int[] tableauEntier2 = new int[6];

A 2 dimensions:

int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} };

Accéder:

1/ boucle avec indice :

char tCar[] = {'a','b','c','d','e','f','g'};

for (int i = 0; i < tCar.length; i++) {   // propriété: length, c'est la longueur du tableau!

          System.out.println("Emplacement:  " + i +" , on a: " + tCar[i]);  // indice à partir de 0
}

2/ Mieux:

String tab[] = {"toto", "titi", "tutu", "tete", "tata"};
for(String str : tab)  // str prend successivement les différentes valeurs
       System.out.println(str);
----> Attention au dépassement: tab[5] plante! dans l'ex précédent (java.lang.ArrayIndexOutOfBoundsException)

----> Il n'est pas possible (sauf réallocation) d'étendre le tableau (comme en JS avec push) : s'il faut modifier la taille ce n'est pas ce composant qu'il faut utiliser!

2/ Application: 1JSE-05.1-Tableau : 
Pouvez-vous tirer au sort un jour de la semaine et l'afficher svp?



3/ Aide: la classe Random:
int min = 1;

int max = 10;

// tire un entier entre 1 et 10 compris aléatoirement

int value = new java.util.Random().nextInt(max + min) + min;

}

