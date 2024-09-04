
input_my_list = [1,2,3,4,340,5,6,7,8,9,0,236, 989, 233, 14546, 237,450, 230]

output_list =[]
for i in input_my_list:
    if i % 2 == 0 and i <= 237:
        output_list.append(i)
        i +=1
    else:
        exit
    i +=1
print(output_list) 
    
