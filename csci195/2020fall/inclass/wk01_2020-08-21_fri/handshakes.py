# handshakes.py

def main():
    # Input
    X = int(input('How many students? '))
    
    # Process
    shakes = X * (X-1)/2
    
    # Output
    # Normal print statement
    print('With', X, 'students there are', shakes, 'handshakes')
        
    # Print using an f-string
    message = f'With {X} students there are {shakes} handshakes'
    print(message)
    
main()