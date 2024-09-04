#!/usr/bin/python3
from sys import argv;
# idem que premier avec une case en plus, On met la chaine du second élément de argv dedans (numéro 1)
nom = argv[1]; # parce que le premier est numéro 0 : le nom du programme
age = argv[2]; # On met la chaine du 3ème élément de argv dedans

print('Hello', nom);
print('Votre âge est ', age);
