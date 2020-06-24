# getTimeString.py
import datetime

def getTimeString():
    '''
    Function that takes no arguments but returns a value
    '''
    
    today = datetime.datetime.now()
    s = today.strftime('%A, %B %d, %Y at %I:%M %p')
    
    return s

def main():
    theTime = getTimeString()
    print(theTime)
    print(f'It is now {getTimeString()}')
    
main()