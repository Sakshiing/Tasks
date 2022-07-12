#13 Count the prime numbersProgram to count all prime numbers upto given number

max_num = int(input("Enter max number: "))
count = 0
for num in range(2,max_num+1):
    if num > 1:
        for i in range(2,num):
            if(num%i)==0:
                break
        else:
            count= count+1
print("Total number of prime in the given limit: ",count)