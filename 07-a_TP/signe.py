#!/usr/bin/python3
from sys import argv;

a = argv[1];
b = argv[2];

a = int(a);
b = int(b);

if (a < 0) != (b < 0): # il suffit que les signes soient différents pour être négatifs
	print ("negatif");
else:
	print ("positif");
