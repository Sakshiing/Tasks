#7. Palidrome NumberMr. Lalwani having Some Currency. The currency having number as Palidrome gets 3 times more than the currency. So help out Mr. Lalwani to check which currency going to give him 3 times return.

currency = int(input("Enter currency"))
curnum = int(input("Enter currency number"))
palin = str(curnum)
if palin == palin[::-1]:
    
    print("Hurray!! Your Currency is Palindrome and you get 3 times more money ",3*currency)
else:
    print("Oops! Your currency is no palindrome you did not get 3 times of money")
