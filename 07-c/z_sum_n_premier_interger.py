
import math


def check_prime (n):
    if n < 1 :
        return False
    for i in range(2, int((math.sqrt(n)) )+ 1 ):
        if n % i == 0:
            return False
    return True






# To check the prime function
# if check_prime(n):
    # print(f"{n} is a prime number")
# else:
    # print(f"{n} in NOT prime")



n = int(input("Saisir un numbre pour voir le somme "))
user_list = range(2, n+1,1)


def somme_prime(user_list):
    prime_list = []
    for i in user_list:
        if check_prime(i):
            prime_list.append(i)
    print(f"This is the list of prime numbers {prime_list}")
    total_prime= sum (prime_list)
    print(f"Sum of the total prime numbers in this range is {total_prime}")

result = somme_prime(user_list)
