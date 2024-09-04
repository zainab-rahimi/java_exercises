#!/usr/bin/python3

# Saisir 3 nombres
a = input("a = ");
b = input("b = ");
c = input("c = ");

# Quand on fait un saisie avec input, on obtient des string (chaines de caractère)
# du coup il va falloir convertir en integer parce que le + sur les int et le + sur les chaines
# ça fait pas pareil

a = int(a);
b = int(b);
c = int(c);

print( "La somme de ", a , " + ", b, " + ", c, " = ", a + b + c);
