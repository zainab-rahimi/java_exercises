#!/usr/bin/python3
chaine = input("Saisir chaine : ");
# j'ai des String
debut = input("Saisir debut : ");
fin = input("Saisir fin : ");

# Mais ? J'ai besoin de ?
debut = int(debut);
fin = int(fin);

print( chaine[ debut-1 : fin ] );
