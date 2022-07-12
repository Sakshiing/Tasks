#3 Sum of Digits / Digital root.

def digital_root(n):
    lst = [int(x) for x in str(n)]
    result = sum(lst)
    if result < 10:
        return result
    else:
        return digital_root(result)