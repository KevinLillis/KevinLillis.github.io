# transposition-cipher.py

def scramble2encrypt1(plainText):
    ''' This is how our book does it'''
    oddChars = ''  # Accumulators for the characters
    evenChars = ''
    index = 0
    
    for ch in plainText:
        if index % 2 == 1:
            # this is an odd index
            oddChars += ch
        else:
            # this is an even index
            evenChars += ch
        
        index += 1
    
    cipherText = oddChars + evenChars
    return cipherText

def scramble2encrypt2(plainText):
    ''' This uses the index directly in the loop.'''
    oddChars = ''  # Accumulators for the characters
    evenChars = ''
    
    for index in range(len(plainText)):
        if index % 2 == 1:
            # this is an odd index
            oddChars += plainText[index]
        else:
            # this is an even index
            evenChars += plainText[index]
            
    cipherText = oddChars + evenChars
    return cipherText

def scramble2encrypt3(plainText):
    '''No for loop, use string slicing instead.'''
    oddChars = plainText[1::2]
    evenChars = plainText[::2]
    
    cipherText = oddChars + evenChars
    return cipherText

def scramble2encrypt4(plainText):
    '''Same logic as three, but on one line'''
    return plainText[1::2] + plainText[::2]

def scramble2decrypt(cipherText):
    halfLength = len(cipherText) // 2
    
    oddChars = cipherText[:halfLength]
    evenChars = cipherText[halfLength:]
    
    decryptedText = ''
    for i in range(halfLength):
        decryptedText += evenChars[i]
        decryptedText += oddChars[i]
        
    # see if there is one more even character
    if len(oddChars) < len(evenChars):
        decryptedText += evenChars[-1]
        
    return decryptedText

def main():
    plainText = input('Enter a message: ')
    cipherText = scramble2encrypt3(plainText)
    decryptedText = scramble2decrypt(cipherText)
    
    print(f'{plainText = }')
    print(f'{cipherText = }')
    print(f'{decryptedText = }')
    
main()
    
    