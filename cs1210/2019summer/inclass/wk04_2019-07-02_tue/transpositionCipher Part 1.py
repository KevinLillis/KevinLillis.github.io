# First Part of Transposition Cipher
# Only includes the encryption part

def scramble2Encrypt(plainText):
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

def main():
    message = input('Enter a message: ')
    print('Original message:', message)
    
    cipher = scramble2Encrypt(message)
    print('Encrypted message', cipher)
    
main()