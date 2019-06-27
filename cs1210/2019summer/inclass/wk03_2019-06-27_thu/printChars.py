def printChars(message):
    '''Print the characters of the given message, 
    separated by dashes.'''
    
    firstChar = True
    for ch in message:
        if firstChar:
            print(ch, end = '')
            firstChar = False
        else:
            print('-' + ch, end = '')
    print()
    
    
def main():
    s = input('Enter a message: ')
    printChars(s)
    
main()