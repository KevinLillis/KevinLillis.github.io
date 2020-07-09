# print-chars.py

def printChars1(message, separator):
    '''
    Print the characters of the message, separated by the given separator.
    '''
    
    firstChar = True
    for i in range(len(message)):
        if firstChar:
            print(message[i], end='')
            firstChar = False
        else:
            print(separator + message[i], end='')
    
    print()
    

def printChars2(message, separator):
    '''
    Print the characters of the message, separated by the given separator.
    '''
    
    firstChar = True
    for ch in message:
        if firstChar:
            print(ch, end='')
            firstChar = False
        else:
            print(separator + ch, end='')
    
    print()

def main():
    s = input('Enter a message: ')
    sep = '--==--'
    printChars1(s, sep)
    printChars1(s, sep)
    
main()