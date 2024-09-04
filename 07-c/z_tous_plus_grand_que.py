
import random

## make a random list of 2o numbers
random_list =[]
n = 20
for i in range (n):
    random_list.append(random.randint(1, 10000))
print(f"This is the random list: \n{random_list}")


# Get user input number to check if it is greater than the numbers inside the list
user_num = int(input("Saisir un nombre à verify: "))

#Define the function to compare the user input with each element in the list
def compare_tous (given_n , given_list):
    for i in given_list:
       if given_n <= i:
           return False
    else:
           return True


result = compare_tous(given_n=user_num, given_list=random_list)
print(f"The user number is greater than all elements in the list: {result}")
