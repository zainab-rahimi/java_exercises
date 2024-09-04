#!/usr/bin/python3
chaine = input("saisir une chaine : ");
index = input("saisir l'index pour couper le debut : ");

index = int(index);

# Première solution en calculant (compatible avec tous les langages)
# len(chaine) qui permet de calculer la longueur / coupure
# [N:] les derniers caractères a partir de N
# [:N] garde du début à N caractère
print(chaine[ len(chaine) - index:]);

# Deuxième solution en utilisant l'index inverse de python 
print(chaine[ - index :]);




