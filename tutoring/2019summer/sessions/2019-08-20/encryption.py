def makeKey(alphabet, offset):
    back = alphabet[offset:]
    front = alphabet[:offset]
    key = back + front
    return key

def encrypt(alphabet, key, message):
    cypherText = ''
    for ch in message:
        index = alphabet.find(ch)
        encryptedChar = key[index]
        cypherText += encryptedChar
    
    return cypherText
  
def mainEncrypt(alphabet):
    offset = int(input('Enter Offset: '))
    message = input('Type message: ')
    key = makeKey(alphabet, offset)
    
    encryptedMessage = encrypt(alphabet, key, message)
    print(f'Your encryptd message is\n{encryptedMessage}')
    
def main():
    alphabet = 'abcdefghijklmnopqrstuvwxyz'
    alphabet += 'ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    alphabet += '0123456789'
    alphabet += ',.?!@#$%^&*()-=_+{}[];:<>/`~ '
    
    mainEncrypt(alphabet)
    
main()