#12 All prime numbers between rangeProg to print all prime numbers between given range

num1 = int(input("Enter num1: "))
num2 = int(input("enter num2: "))

print("Prime number between",num1,"and",num2,"are: ")
for num in range(num1,num2+1):
    if num > 1:
        for i in range(2,num):
            if(num % i) == 0:
                break
        else:
            print(num)
