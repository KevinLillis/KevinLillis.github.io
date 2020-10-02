# substitution-cipher-small-with-random-key.py
import random # only needed to generate a random key

def subEncrypt(plaintext, key):
    '''
    Assumes:
       Key is a permutation of the alphabet.
       Same alphabet is used for encryption and decryption
    '''
    alphabet = 'abcdef'
    
    ciphertext = ''
    for ch in plaintext:
        index = alphabet.index(ch)
        ciphertext += key[index]
        
    return ciphertext

def subDecrypt(ciphertext, key):
    '''
    Assumes:
       Key is a permutation of the alphabet.
       Same alphabet is used for encryption and decryption
    '''
    alphabet = 'abcdef'

    decrypted = ''
    for ch in ciphertext:
        index = key.index(ch)
        decrypted += alphabet[index]

    return decrypted    

def getRandomKey():
    alphabet = 'abcdef'
    chars = alphabet
    numChars = len(chars)
        
    key = ''
    for j in range(numChars):
        index = random.randint(0, len(chars) - 1)
        key += chars[index]
        
        # remove the character that was used
        chars = chars[ : index] + chars[index + 1 :]
        
    return key
    

def main():
    key = getRandomKey()
    print(f'{key = }')
    
    plaintext = 'bed'
    print(f'{plaintext = }')
    
    # Encryption
    ciphertext = subEncrypt(plaintext, key)
    print(f'{ciphertext = }')
    
    # Decryption
    decrypted = subDecrypt(ciphertext, key)
    print(f'{decrypted = }')
    
main()