#!/usr/bin/python3

from math import pi;

# on me demande de saisir le rayon
r = input("Entrer le rayon : ");

# on convertit en int parce que les inputs sont des chaines
r = float(r);

# et la on doit pouvoir calculer l'aire du cercle PI x r²
aire = pi * ( r * r);

print("L'aire du cercle est = ", aire);
