#15. Program to find count of all factors of given number.

number = int(input("Enter any number: "))
count = 0
print("The factors of ",number,"are: ")
for i in range(1,number+1):
    if number%i == 0:
        count = count+1

print("The total factors of the given no. are: ",count)