#!/usr/bin/python3
# Equation de la forme ax²+bx+c=0
# inconnu c'est x, c'est donc lui que l'on doit trouver
# L'utilisateur doit rentrer a, b, c

import math;

a = float( input("Rentrer a : ") );
b = float( input("Rentrer b : ") );
c = float( input("Rentrer c : ") );

print ("Les variables du problème sont", "a=", a, "b=", b, "c=", c);

# Calculer b²−4ac
delta = b**2 - 4 * ( a * c);

print ("Mon discriminant est = ", delta);
if delta > 0 : # Admet 2 solutions
	solution1 = ( -b - math.sqrt(delta) ) / ( 2 * a);
	solution2 = ( -b + math.sqrt(delta) ) / ( 2 * a);
	print ("Le problème admet 2 solutions réelles, ", solution1 , " et ", solution2);
elif delta == 0:
	solution1 = -b / (2 * a);
	print ("Le problème admet 1 solution réelle, ", solution1);
else: # on est forcément en dessous de 0
	print ("Le problème n'a pas de solutions réelles.");
