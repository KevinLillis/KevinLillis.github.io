def linearSearchI(L, key):
    '''
    Returns the index where key is found, or -1 if key is not found.
    Iterative version, which is the norm.
    '''
    for index in range(len(L)):
        if L[index] == key:
            return index
        
    # the only way we'll ever got to this point is if the key
    # is ot in the list. So we can return -1
    return -1

def linearSearchR1(L, key, index):
    '''
    Returns the index where key is found, or -1 if key is not found.
    Recursive version, which is unusual.
    '''

    # Check for base cases
    if index == len(L):
        return -1

    if L[index] == key:
        return index

    # Recursive call
    return linearSearchR1(L, key, index + 1)

def linearSearchR2(L, key, index = 0):
    '''
    Returns the index where key is found, or -1 if key is not found.
    Recursive version, which is unusual.
    Allows function to be called without sending index
    '''
    # Check for base cases
    if index == len(L):
        return -1

    if L[index] == key:
        return index

    # Recursive call
    return linearSearchR2(L, key, index + 1)

def main():
    L = [15, 10, 5, 30, 35, 20, 25]
    print(L)
    
    key = 15
    
    index = linearSearchI(L, key)
    # index = linearSearchR1(L, key, 0)
    # index = linearSearchR2(L, key)
    
    if index >= 0:
        print(f'key = {key}. Found at L[{index}]')
    else:
        print(f'key = {key} not Found')    


main()
    