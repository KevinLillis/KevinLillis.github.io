# substitution-cipher-small-with-functions.py

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

def main():
    key = 'badfce'
    plaintext = 'bed'
    
    print(f'{plaintext = }')
    
    # Encryption
    ciphertext = subEncrypt(plaintext, key)
    print(f'{ciphertext = }')
    
    # Decryption
    decrypted = subDecrypt(ciphertext, key)
    print(f'{decrypted = }')
    
main()