# 6 Replace digits with 0 and 1Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string. Note: input will never be an empty string

def string_of_digits(s):
    sa=list(map(int,s))
    result =[]
    for i in sa:
        if i >5 :
            result.append('1')
        else:
            result.append('0')
    ans= "".join(result)
    return ans
s =input("enter your number : ")
print(string_of_digits(s))