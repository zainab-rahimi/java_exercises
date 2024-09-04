#!/usr/bin/python3
chaine = input("Rentrer une phrase : ");

print( len(chaine) );

################ Autre exemple basé sur une boucle ##############
longueur = 0;
for lettre in chaine:
	longueur += 1;

print (longueur);
