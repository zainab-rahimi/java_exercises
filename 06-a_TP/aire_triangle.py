#!/usr/bin/python3

# on me demande de saisir la hauteur et la base
h = input("Entrer la hauteur");
b = input("Entrer la base");

# on convertit en int parce que les inputs sont des chaines
h = int(h);
b = int(b);

# et la on doit pouvoir calculer l'aire du triangle
aire = (h * b) / 2;

print("L'aire du triangle est = ", aire);
