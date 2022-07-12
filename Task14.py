#14. Program to find all factors of the given number.

number = int(input("Enter any number: "))

print("The factors of ",number,"are: ")
for i in range(1,number+1):
    if number%i == 0:
        print(i)