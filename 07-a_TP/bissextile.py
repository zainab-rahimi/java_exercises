#!/usr/bin/python3

annee = input("Saisir une année : ");
annee = int(annee);

# Si A n'est pas divisible par 4, l'année n'est pas bissextile.
if annee % 4 != 0:
	print("Non bissextile");
# Si A est divisible par 4, l'année est bissextile sauf si A est divisible par 100 et pas par 400.
elif annee % 100 == 0 and annee % 400 != 0 : # A est forcément divisible par 4
	print("Non bissextile");
else:
	print("Bissextile");

# Alternative optimisée
if annee % 4 == 0 and annee % 100 != 0 or annee % 400 == 0:
    print("Bissextile!")
else:
    print("Non bissextile!")