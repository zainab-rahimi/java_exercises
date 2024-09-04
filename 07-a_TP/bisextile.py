



def leap_year(year):
    if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
        return True
        print(year," is a leap year")
    else:
        return False
        print(year, " is not a  leap year")

year = int(input("Saisir quell'annee vous voulez verifyer: "))

