# substitution-cipher-small-demo.py

def main():
    alphabet = 'abcdef'
    key = 'dabfce'
    plaintext = 'bed'
    
    print(f'{plaintext = }')
    
    # Encryption
    ciphertext = ''
    for ch in plaintext:
        index = alphabet.index(ch)
        ciphertext += key[index]
        
    print(f'{ciphertext = }')
    
    # Decryption
    decrypted = ''
    for ch in ciphertext:
        index = key.index(ch)
        decrypted += alphabet[index]
        
    print(f'{decrypted = }')
    
main()
    