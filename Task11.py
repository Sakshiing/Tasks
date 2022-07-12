#11 Number is Prime or notProg to check given number is prime or not.

num = int(input("Enter any number: "))

if num > 1:
    for i in range(2, int(num/2)+1):
        if(num%i) == 0:
            print("Number is not a Prime Number.")
            break
        
    else:
        print("Number is Prime Number")
else:
    print("Number is not prime number")