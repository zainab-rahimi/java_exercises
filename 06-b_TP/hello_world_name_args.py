#!/usr/bin/python3
# On nous demande de remplacer l' input(....) de l'utilisateur par un argument en ligne de commande
# pour appeler le programme, ça sera ./hello_world_name_args.py mon_prenom

# On réalise l'import du module sys qui permet d'accéder au système d'exploitaition
# et plus particulièrement argv qui va contenir un tableau représentant les arguments en ligne de commande
from sys import argv;
# Quand on tape ./hello_world_name_args.py mon_prenom
# argv est un tableau de 2 cases = [ ./hello_world_name_args.py || mon_prenom ]
nom = argv[1]; # Dont on met la seconde dans le nom
# evidement, si on tape juste ./hello_world_name_args.py argv[1] tente d'accéder à un truc qui n'existe pas
# et ça plante avec un index out of range
print('Hello', nom);
