# lookAtPrint.py

def main():
    message = 'IOWA'
    print(message)
    print(message, end = '<>')
    print(message, end = 'xyz')
    print()
    print(message, end='\n')
    print(message, end='abc')
    
    print('===================================')
    
    print('first', 'second', 'third')
    print('first', 'second', 'third', sep='-')
    print('first', 'second', 'third', sep='\n')
    
main()