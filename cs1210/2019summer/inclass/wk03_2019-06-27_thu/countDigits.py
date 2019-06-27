def countDigits(quote):
    '''Count how many digits are in the given string called quote'''
    numDigits = 0
    for ch in quote:
        if ch.isdigit():
            numDigits += 1
            
    return numDigits

def main():
    message = input('Enter a string: ')
    count = countDigits(message)
    print(f'Your string has {count} digits')
    
main()