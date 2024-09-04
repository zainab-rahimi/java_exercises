#!/usr/bin/python3

# Saisir 2 nombres
a = input("a = ");
b = input("b = ");

# debut hors sujet : Ne fait pas partie de l'exo juste pour montrer + sur des chaines
print(a + b);
k = "toto";
l = "tutu";
print (k + l); # affiche tototutu
# Fin Hors sujet

# Quand on fait un saisie avec input, on obtient des string (chaines de caractère)
# du coup il va falloir convertir en integer parce que le + sur les int et le + sur les chaines
# ça fait pas pareil

a = int(a);
b = int(b);

print( "La somme de ", a , " + ", b, " = ", a + b );
