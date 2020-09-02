# getTimeString.py
import datetime

def getTimeString():
    '''
    Example of a function that takes not parameters/argument and returns 
    a string.
    '''
    today = datetime.datetime.now()
    message = today.strftime('%A, %B %d, %Y at %I:%M %p')
    return message

def main():
    theTime = getTimeString()
    print(f'It is now {theTime}')
    
main()