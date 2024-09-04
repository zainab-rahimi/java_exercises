#!/usr/bin/python3
from math import pi;
import sys;

type = input("Rentrer cercle ou sphere : ");

rayon = input("Donner un rayon :");
rayon = int(rayon);

if rayon < 0:
	print("le rayon n'est pas un nombre positif");
else :
	print("Votre rayon est : ", rayon);

	if type == "cercle":
		aire = pi * rayon**2;
		print ("L'aire est de ", aire);
	elif type == "sphere":
		volume = ( 4 * pi * (rayon**3) ) / 3;
		print ("Le volume est de ", volume);
	else:
		print ("le type n'est pas bon");
