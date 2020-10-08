# s1-substitution-cipher-small-with-password.py

import random  # only needed to generate random key


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


def subDecrypt(cipherText, key):  # Key must be same length as alphabet
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
    numChars = len(alphabet)
    chars = alphabet  # make copy of alphabet

    key = ''
    for i in range(1, numChars + 1):
        # i goes from 1 to len
        index = random.randint(0, numChars - i)
        key += chars[index]

        # remove the character that was used
        chars = chars[: index] + chars[index+1:]

    return key


def removeDupes(aString):
    '''
    Remove all duplicates.
    '''
    newString = ''
    for ch in aString:
        if ch not in newString:
            newString += ch

    return newString


def removeMatches(aString, removeChars):
    '''
    Remove all chars that are in the 
    second string from the first string.
    '''
    newString = ''
    for ch in aString:
        if ch not in removeChars:
            newString += ch

    return newString


def genKeyFromPassword(password):
    alphabet = 'abcdef'

    password = removeDupes(password)

    lastChar = password[-1]
    lastCharIndex = alphabet.index(lastChar)

    beforeString = alphabet[:lastCharIndex]
    afterString = alphabet[lastCharIndex + 1:]

    beforeString = removeMatches(beforeString, password)
    afterString = removeMatches(afterString, password)

    key = password + afterString + beforeString

    return key


def main():
    plaintext = input('Enter a message: ')
    password = input('Enter password: ')

    key = genKeyFromPassword(password)
    print(f'{"key":12}{key}')

    # Encryption
    ciphertext = subEncrypt(plaintext, key)
    print(f'{"ciphertext":12}{ciphertext}')

    # Decryption
    decrypted = subDecrypt(ciphertext, key)
    print(f'{"decrypted":12}{decrypted}')


main()
