# printTimeString.py

import datetime

def printTimeString():
    '''
    Example of a function that takes no parameters/arguments
    and returns no value.
    '''
    
    today = datetime.datetime.now()

    s = ''
    s += today.strftime('%A') # Full weekday name
    
    s +=', '
    s += today.strftime('%B') # Full month name
    
    s += ' '
    s += today.strftime('%d') # day of the month as a decimal
    
    s += ', '
    s += today.strftime('%Y') # 4-digit year
    
    s += ' at '
    s += today.strftime('%I') # Hour, 12-hour clock
    
    s += ':'
    s += today.strftime('%M') # digit minute
    
    s += ' '
    s += today.strftime('%p') # AM/PM
    
    print(f'It is now: {s}')


    # Do this all on a single linke
    message = today.strftime('%A, %B %d, %Y at %I:%M %p')
    print(f'It is now: {message}')
    
    
def main():
    printTimeString()
    
main()