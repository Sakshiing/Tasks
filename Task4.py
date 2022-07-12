#4 Sum of Cubes.

def sum_cubes(n):
    # your code here
    sum = 0
    for i in range(1, n + 1):
        sum += i * i*i
         
    return sum