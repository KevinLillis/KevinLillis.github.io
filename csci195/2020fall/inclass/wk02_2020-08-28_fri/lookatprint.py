# lookatprint.py

def main():
    print('first', 'second', 'third')    
    print('first', 'second', 'third', sep='<--->')    
    print('first', 'second', 'third', sep='')
    print('first', 'second', 'third', sep='\n')    

    print()
    print()
    
    message = 'Iowa'
    print(message)
    print(message, end='<->')
    print('Line after message')
    
main()