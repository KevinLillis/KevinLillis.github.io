# Transposition Cipher

def scramble2Encrypt1(plainText):
    ''' This is how our book does it.'''
    oddChars = ''     # Accumulator for characters
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
    ''' This uses the index directly in the loop.'''
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
    ''' This is a more "Pythonic" way to do it.'''
    oddChars = plainText[1::2]
    evenChars = plainText[::2]
    
    cipherText = oddChars + evenChars
    return cipherText


def scramble2Decrypt(cipherText):
    halfLength = len(cipherText) // 2
    
    oddChars = cipherText[:halfLength]
    evenChars = cipherText[halfLength:]
    
    decryptedText = ''
    for i in range(halfLength):
        decryptedText += evenChars[i]
        decryptedText += oddChars[i]
        
    # See if there is one more even char
    if len(oddChars) < len(evenChars):
        decryptedText += evenChars[-1]
        
    return decryptedText
    

def main():
    message = input('Enter a message: ')
    cipher = scramble2Encrypt3(message)
    decryptedMessage = scramble2Decrypt(cipher)

    print(' Original message:', message)
    print('Encrypted message:', cipher)
    print('Decrypted message:', decryptedMessage)
    
def testEncryption():
    message = 'connecticut shoreline'
    print(f'Plaintext: {message}')
    print(scramble2Encrypt1(message))
    print(scramble2Encrypt2(message))
    print(scramble2Encrypt2(message))
    print()

    # Even number of characters
    message = 'abababab'
    print(f'Plaintext: {message}')
    print(scramble2Encrypt1(message))
    print(scramble2Encrypt2(message))
    print(scramble2Encrypt2(message))
    print()

    # Odd number of characters, extra character goes with the evens
    message = 'ababababc'
    print(f'Plaintext: {message}')
    print(scramble2Encrypt1(message))
    print(scramble2Encrypt2(message))
    print(scramble2Encrypt2(message))

def testDecryption():
    ciphertext = 'aaaabbbb'
    print(f'Ciphertext: {ciphertext}')
    print(scramble2Decrypt(ciphertext))
    print()

    ciphertext = 'aaaabbbbc'
    print(f'Ciphertext: {ciphertext}')
    print(scramble2Decrypt(ciphertext))
    print()

    ciphertext = 'onciu hrlncnetctsoeie'
    print(f'Ciphertext: {ciphertext}')
    print(scramble2Decrypt(ciphertext))
    print()


# testEncryption()
# testDecryption()
main()