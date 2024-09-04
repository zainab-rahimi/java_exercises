#!/usr/bin/python3
x = input("Saisir x");
y = input("Saisir y");
z = input("Saisir z");

x = int(x);
y = int(y);
z = int(z);

max = x;
if y > max:
	max = y;
if z > max:
	max = z;

min = x;
if y < min:
	min = y;
if z < min:
	min = z;

milieu = x;
if x != max and x != min:
	milieu = x;
if y != max and y != min:
	milieu = y;
if z != max and z != min:
	milieu = x;

print (min, milieu, max);
