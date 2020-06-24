# printTimeString.py
import datetime

def printTimeString():
    '''
    Function that takes no arguments and does not return anything.
    '''
    
    today = datetime.datetime.now()
    
    s = ''
    s += today.strftime('%A') # Full weekday name
    s += ', '
    s += today.strftime('%B') # Full month name
    s += ', '
    s += today.strftime('%d') # day of month as decimal
    s += ', '
    s += today.strftime('%Y') # 4-digit year
    s += ', '
    s += today.strftime('%I') # Hour, 12-hour clock
    s += ', '
    s += today.strftime('%M') # digit minute
    s += ', '
    s += today.strftime('%p') # AM/PM
    
    print(f'It is now {s}')
    
    # Do it all on one line
    s = today.strftime('%A, %B %d, %Y at %I:%M %p')
    print(f'It is now {s}')
    
def main():
    printTimeString()
    
main()