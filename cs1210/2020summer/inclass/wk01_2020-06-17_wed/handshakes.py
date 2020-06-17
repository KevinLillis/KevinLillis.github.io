# handshakes.py
def main():
    # Input
    n = int(input('How many students? '))
    
    # Process
    shakes = int((n*(n-1))/2)
    
    # Output
    print('With', n, 'students there are', shakes, 'handshakes.')
    
    # Print same message using an f-string
    message = f'With {n} students there are {shakes} handshakes.'
    print(message)

main()