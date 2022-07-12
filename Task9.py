9 Find Missing Letter

def find_missing_letter(chars):
    misschar = 'qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM'
    for i in range(0,len(chars)-1):
        if(ord(chars[i+1]) - ord(chars[i]) > 1):
            misschar = chr(ord(chars[i])+1)

    return misschar