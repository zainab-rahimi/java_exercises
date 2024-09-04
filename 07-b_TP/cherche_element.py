#!/usr/bin/python3

numbers = [ 386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 958,743, 527 ];

a = input("Rentrer un nombre");
a = int(a);

for i in range(0, len(numbers) ):
	if numbers[i] == a:
		print(i);
		break;
else :
	print ("Aucune occurence");
