# input-validation-with-while.py

def inputNumber(low, high):
    '''
    reads a number n and makes sure low <= n <= high
    '''
    if high < low:
        low, high = high, low
        
    # Now we are sure low <= high
    
    num = int(input(f'Enter a number from {low} to {high}: '))
    
    while not low <= num <= high:
        print('Invalid number')
        num = int(input(f'Enter a number from {low} to {high}: '))
        
    return num

def main():
    value = inputNumber(4, 12)
    print(value)
    
main()
        
    