def hello(i): # This crashes
    print(f'Hello {i}')
    hello(i+1)
    
hello(1)