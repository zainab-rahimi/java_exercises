#!/usr/bin/python3
# on nous demande pythagore a² + b² = c²
# c = racine_carre( a² + b²)
from math import sqrt;
from math import pow;

# Saisir 2 nombres
a = input("a = ");
b = input("b = ");

# Quand on fait un saisie avec input, on obtient des string (chaines de caractère)
# du coup il va falloir convertir en integer parce que le + sur les int et le + sur les chaines
# ça fait pas pareil

a = int(a);
b = int(b);

c = sqrt( (a**2) + pow(b, 2) );

print( "L'hypothénuse de ", a , " et ", b, " donne c = ", c );
