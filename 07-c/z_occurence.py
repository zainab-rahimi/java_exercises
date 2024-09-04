
import string
#Count number of each character in a sentence



# Get the user sentence 
sentence = str(input("écrir ton phrase svp: "))

#Define an empty dict to hold the key values for each character
char_counts = {}
for char in sentence:
    char_insensitive = char.lower()
    if char_insensitive == " ": ##skip the space to only count the characters
        continue
    if char_insensitive in char_counts :
        char_counts[char_insensitive] += 1
    else:
        char_counts [char_insensitive]= 1

#print(char_counts)


for char in sorted(char_counts):
    print(f"'{char}': {char_counts[char]}")
