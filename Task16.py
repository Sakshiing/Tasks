#16. Program to find all prime factors of given number.

def prime_fact(number):
    i = 2
    factors = []
    while i*i <= number:
        if number%i == 0:
            factors.append(i)
            number //= i
        else:
            i += 1
    
    if number>1:
        factors.append(number)
    
    return factors


number = int(input('Enter any number: '))


factors = prime_fact(number)


print("Prime factors of: ",number, "are", factors)