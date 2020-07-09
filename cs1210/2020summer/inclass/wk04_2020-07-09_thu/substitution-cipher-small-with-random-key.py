# substitution-cipher-small-with-random-key.py
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


def getRandomKey():
    alphabet = 'abcdef'
    chars = alphabet 
    numChars = len(chars)

    key = ''
    for j in range(numChars):
        index = random.randint(0, len(chars) - 1)
        key += chars[index]

        # remove the character that was used
        chars = chars[ : index] + chars[index+1 : ]

    return key

def main():
    key = getRandomKey()
    plaintext = 'bed'

    print(f'{"plaintext":12}{plaintext}')

    print(f'{"key":12}{key}')
    
    # Encryption
    ciphertext = subEncrypt(plaintext, key)
    print(f'{"ciphertext":12}{ciphertext}')

    # Decryption
    decrypted = subDecrypt(ciphertext, key)
    print(f'{"decrypted":12}{decrypted}')
    
main()