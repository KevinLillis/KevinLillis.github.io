def getalphabet():
    alphabet = ''
    alphabet = alphabet + 'abcdefghijklmnopqrstuvwxyz'
    alphabet = alphabet + 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    alphabet = alphabet + '`1234567890-=~!@#$%^&*()_+'
    alphabet = alphabet + '[]{};:<>,.?/'
    alphabet = alphabet + "'"
    alphabet = alphabet + '"'
    
    return alphabet

def removedups(password):
    # Remove duplicagte letters from the given password
    newword = ''
    for letter in password:
        if letter not in newword:
            newword += letter
            
    return newword

def removefromalphabet(password):
    alphabet = getalphabet()
    newalphabet = ''
    
    for letter in alphabet:
        if letter not in password:
            newalphabet += letter
            
    return newalphabet

def getkey(password):
    # Key must be the same length as the alphabet
    alphabet = getalphabet()

    # remove duplicate letters from password
    newpassword = removedups(password)
    newalphabet = removefromalphabet(newpassword)
    key = newalphabet + newpassword
    return key

def main():
    alphabet = getalphabet()
    
    key = getkey('moon')
    
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