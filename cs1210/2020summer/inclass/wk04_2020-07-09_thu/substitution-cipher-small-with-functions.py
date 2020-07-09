# substitution-cipher-small-with-functions.py
import random # only needed to generate random key

def subEncrypt(plainText, key):
    '''
    Assumes:
        key is a permutation of alphabet.
        Same alphabet used for encryption and decryption.
    '''

    alphabet = 'abcdef'

    cipherText = ''
    for ch in plainText:
        index = alphabet.index(ch)
        cipherText += key[index]
 
    return cipherText

def subDecrypt(cipherText, key): # Key must be same length as alphabet
    '''
    Assumes:
        key is a permutation of alphabet.
        Same alphabet used for encryption and decryption.
    '''
    alphabet = 'abcdef'

    decryptedText = ''
    
    for ch in cipherText:
        index = key.index(ch)
        decryptedText += alphabet[index]
        

    return decryptedText

def main():
    key = 'dabfce'
    plaintext = 'bed'

    print(f'{"plaintext":12}{plaintext}')
    
    # Encryption
    ciphertext = subEncrypt(plaintext, key)
    print(f'{"ciphertext":12}{ciphertext}')

    # Decryption
    decrypted = subDecrypt(ciphertext, key)
    print(f'{"decrypted":12}{decrypted}')
    
main()