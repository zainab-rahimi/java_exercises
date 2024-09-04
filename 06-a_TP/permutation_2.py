#!/usr/bin/python3

### Le programme demande de saisir 2 valeur
a = input("Rentrer un truc : ");
b = input("Rentrer un autre truc différent de truc : ");

print("a =", a);
print("b =", b);

# première solution avec une variable supplémentaire 
# permutation des variable, donc si j ai rentré 1 et 2, je dois afficher 2 et 1
# J'imagine que j'ai 2 bouteilles, a et b et que je dois mettre le liquide de a dans b et b dans a
# j'ai besoin d'une bouteille de plus que j'appelle c
c = a; # je verse a dans c pour vider a
a = b; # a est vide, donc je verse b dans a
b = c; # b est vide, donc je peux vider le contenu de a qui est maintenant dans c dedans

print("a =", a);
print("b =", b);

# deuxième solution en utilisant l'initialisation python (repermute)
a, b = b, a
print("nouvelle permutation");
print("a =", a);
print("b =", b);
