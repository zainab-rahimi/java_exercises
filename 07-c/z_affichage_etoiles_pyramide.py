


star_count = int(input("Saisir une entier pour affichage les etoils: "))


for i in range(1, (star_count+1)):
    line = ' ' * (star_count - i) + '*' * (2 * i - 1)
    #i += 1
    print (line)