
num = int(input("Saisir un nomber positive: "))


def print_grid(n):
    if n <= 0 or n > 20:
        print("number should be less than 20 and positive")
        return False
    else:
        print("XOXOXOXOXOXOX \n" *n)

result = print_grid(num)