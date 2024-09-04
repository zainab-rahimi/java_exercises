#!/usr/bin/python3

numbers = [ 386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 399, 162, 758, 219,
	918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 815, 67, 104, 58, 512, 24, 892, 894, 767,
	553, 81, 379, 843, 831, 445, 742, 717, 958,743, 527 ];

# solution 1, en insérant au début
reverse = [];
for nombre in numbers:
	reverse.insert(0, nombre);

print ( reverse );

# Solution 2, en lisant la liste à l'envers et en insérant
reverse = [];
for i in range( len(numbers) - 1, -1, -1):
	reverse.append( numbers[i] );
print ( reverse );

# Solutions N, il existe encore tout un tas de solutions dont celle ci
reverse = numbers[::-1];
print ( reverse );
