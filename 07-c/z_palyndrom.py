
import string



def is_palyndrom(user_input):
    if user_input[::-1] == user_input:
        return True
    else:
        return False
    
word = str(input("saisir un mot à vérifier si c'est playndrom ou pas: "))

result = is_palyndrom(user_input = word)
print(f"the entered word is polydrone: {result} ")