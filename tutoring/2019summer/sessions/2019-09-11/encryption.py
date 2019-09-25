def getalphabet():
    alphabet = ''
    alphabet = alphabet + 'abcdefghijklmnopqrstuvwxyz'
    alphabet = alphabet + 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    alphabet = alphabet + '`123445567890-=~!@#$%^&*()_+'
    alphabet = alphabet + '[]{};:<>,.?/'
    alphabet = alphabet + "'"
    alphabet = alphabet + '"'
    
    return alphabet

def getkey():
    # Key must be the same length as the alphabet
    alphabet = getalphabet()
    key = alphabet[len(alphabet)::-1] # reversed alphabet
    return key

def main():
    alphabet = getalphabet()
    
    key = getkey()
    
    message = 'Python Rocks!!!'
    
    encmessage = ''
    for letter in message:
        numloc = alphabet.find(letter)
        encletter = key[numloc]
        encmessage = encmessage + encletter
        
    print(encmessage)
    
    origmessage = ''
    for letter in encmessage:
        numloc = key.find(letter)
        origletter = alphabet[numloc]
        origmessage = origmessage + origletter
        
    print(origmessage)
        
main()