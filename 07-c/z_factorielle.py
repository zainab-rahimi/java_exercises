
def find_factoriell(n):
    if n < 0:
        return "Factorial is not defined for negative numbers"
    elif n == 1 or n == 0:
        return "Factorial is 1"
    else:
        result = 1
        for i in range (2, n+1, 1):
            result *= i
            print(i)
        print (f"The factorial of the {n} is {result}")
      

n = int(input("please enter a number: "))
find_factoriell(n)
