#8 Validate PIN Code

def validate_pin(pin):
    if(len(pin)==4 or len(pin)==6):
        bool  = True
        for i in range(len(pin)):
            if(pin[i] not in "0123456789"):
                bool  = False
                break
            else:
                bool  = True
        if(bool):
            return True
        else:
            return False
    else:
        return False