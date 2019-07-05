# Substitution Cipher
import random


def main():
    plainText = input('Enter a message: ')
    
    key = getRandomKey()
    
    password = input('Enter password: ')
    key = genKeyFromPassword(password)
    
    cipherText = subEncrypt(plainText, key)
    decryptedText = subDecrypt(cipherText, key)
    
    print(plainText)
    print(cipherText)
    print(decryptedText)
   
def subEncrypt(plainText, key):
    alphabet = getAlphabet()

    cipherText = ''
    for ch in plainText:
        index = alphabet.index(ch)
        cipherText += key[index]
 
    return cipherText

def subDecrypt(cipherText, key): # Key must be same length as alphabet
    alphabet = getAlphabet()

    decryptedText = ''
    
    for ch in cipherText:
        index = key.index(ch)
        decryptedText += alphabet[index]
        
    return decryptedText
    
    
def getRandomKey():
    alphabet = getAlphabet()
    key = ''
    numChars = len(alphabet)
    
    for i in range(numChars):
        index = random.randint(0, len(alphabet) - 1)
        key += alphabet[index]
        
        # remove the char that was used
        alphabet = alphabet[:index] + alphabet[index+1:]
        
    return key

def getAlphabet():
    alphabet = ''
    for code in range(32, 127):
        alphabet += chr(code)
        
    return alphabet
   
def removeDupes(aString):
    newString = ''
    for ch in aString:
        if ch not in newString:
            newString += ch
            
    return newString
    
def removeMatches(aString, removeChars):
    newString = ''
    for ch in aString:
        if ch not in removeChars:
            newString += ch
            
    return newString
    
def genKeyFromPassword(password):
    alphabet = getAlphabet()
    
    password = removeDupes(password)
    
    lastChar = password[-1]
    lastCharIndex = alphabet.index(lastChar)
    
    beforeString = alphabet[:lastCharIndex]
    afterString = alphabet[lastCharIndex + 1:]
    
    beforeString = removeMatches(beforeString, password)
    afterString = removeMatches(afterString, password)
    
    key = password + afterString + beforeString
    
    return key
    
    
main()