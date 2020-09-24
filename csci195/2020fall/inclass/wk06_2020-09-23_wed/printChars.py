# printChars.py

def printChars(message, separator):
    firstChar = True
    for ch in message:
        if firstChar:
            print(ch, end='')
            firstChar = False
        else:
            print(separator + ch, end='')
    
    print() # print the new line character at the end
    
def main():
    s = input('Enter a message: ')
    sep = ''
    printChars(s, sep)
    
main()