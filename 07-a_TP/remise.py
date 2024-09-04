#!/usr/bin/python3
# Q : Calcul du montant d’une remise
# Un commerçant accorde une remise de 5 % pour tout achat d’un montant compris entre 100 et
# 500 € et 8 % au-delà. Écrire un programme de calcul du montant de la remise sur un achat donné.

montant = input("Donner votre montant");
montant = int(montant);

print ("Le total de la facture est de : ", montant);

if montant < 100:
	remise = 0;
elif montant <= 500:
	remise = 5;
else:
	remise = 8;

print ("La remise est de ", remise, "%");

montantRemise = ( montant / 100 ) * remise;
montant = montant - montantRemise;

print ("Le total de la facture avec la remise est de : ", montant);
