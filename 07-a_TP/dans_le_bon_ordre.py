#!/usr/bin/python3
a = input("Rentrer un nombre a : ");
b = input("Rentrer un nombre b : ");
c = input("Rentrer un nombre c : ");

a = int(a);
b = int(b);
c = int(c);

if a < b and b < c:
	print ("Les nombres sont dans l'ordre croissant");
else:
	print ("Les nombres ne sont pas dans l'ordre croissant");

