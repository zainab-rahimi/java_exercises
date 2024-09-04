#!/usr/bin/python3
from sys import exit;

chaine = input("Saisir chaine : ");
# j'ai des String
debut = input("Saisir debut : ");
fin = input("Saisir fin : ");

# Mais ? J'ai besoin de ?
debut = int(debut);
fin = int(fin);

if debut < 1  :
	print ("Le début est inférieur à 1");
elif fin > len(chaine):
	print ("La fin est supérieure à la longueur de la chaine");
else :
	print( chaine[ debut - 1 : fin ] );


#En utilisant exit (alternative)

#if debut < 1:
#	print ("Le début est inférieur à 1");
#	exit(1);
#if fin > ( len(chaine) ):
#	print ("La fin est supérieure à la longueur de la chaine");
#	exit(2);
#if debut > fin:
#	print ("Le début de la fin");
#	exit(3);

#print( chaine[ debut - 1 : fin ] );

