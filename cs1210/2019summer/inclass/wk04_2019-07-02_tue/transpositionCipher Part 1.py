# First Part of Transposition Cipher
# Only includes the encryption part

def scramble2Encrypt1(plainText):
    ''' This is how our book does it.'''
    oddChars = ''
    evenChars = ''
    index = 0
    
    for ch in plainText:
        if index % 2 == 1:
            # This is an odd index
            oddChars += ch
        else:
            # This is an even index
            evenChars += ch
            
        index += 1
    
    cipherText = oddChars + evenChars
    return cipherText


def scramble2Encrypt2(plainText):
    ''' This is a tweak of how our book does it.'''
    oddChars = ''
    evenChars = ''
    
    for index in range(len(plainText)):
        if index % 2 == 1:
            # This is an odd index
            oddChars += plainText[index]
        else:
            # This is an even index
            evenChars += plainText[index]
            
    
    cipherText = oddChars + evenChars
    return cipherText


def scramble2Encrypt3(plainText):
    ''' This is a more "Pythonic" way to ndo it.'''
    oddChars = plainText[1::2]
    evenChars = plainText[::2]
    
    cipherText = oddChars + evenChars
    return cipherText

def main():
    message = input('Enter a message: ')
    print('Original message:', message)
    
    cipher1 = scramble2Encrypt1(message)
    cipher2 = scramble2Encrypt2(message)
    cipher3 = scramble2Encrypt3(message)
    
    print(cipher1)
    print(cipher2)
    print(cipher3)
    
main()