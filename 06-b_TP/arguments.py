#!/usr/bin/python3
from sys import argv;

nom_programme = argv[0];  # ici on récupère le programme
longueur = len(argv) - 1; # ici on récupère la longueur
arguments = argv[1:];     # la suite des arguments

print ("nom = ", nom_programme);
print ("longueur = ", longueur);
print ( arguments );
