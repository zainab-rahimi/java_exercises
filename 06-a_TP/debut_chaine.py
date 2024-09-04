#!/usr/bin/python3
chaine = input("saisir une chaine : ");
index = input("saisir l'index pour couper la fin : ");

index = int(index);

# [:N] permet de garder uniquement les N premiers caractères
print(chaine[:index]);
