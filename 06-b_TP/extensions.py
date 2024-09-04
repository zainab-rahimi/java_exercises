#!/usr/bin/python3
from sys import argv;

nom_fichier = argv[1];

# qu'est ce que c'est qu'un extension de fichier ?
# l'extension c'est la partie du nom du fichier après le dernier point (.)
# donc pour fichier.pdf, l'extension pdf
# ? comment découper la chaine

# On recherche grace a r index (reverse index) la dernière position d'un point dans une chaine
lastIndexOfPoint = nom_fichier.rindex(".");

# et puis j'applique simplement la fonction qui permet de découper et obtenir la fin du chaine
# chaine[ position :] sauf qu'il faut que je décalle de 1 parce que c'est l'extension qui m'intéresse
print ( nom_fichier[ lastIndexOfPoint + 1 : ] );
