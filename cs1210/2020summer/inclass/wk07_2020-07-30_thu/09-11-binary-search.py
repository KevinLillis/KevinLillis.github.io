def binarySearchI(L, key):
    '''
    Iterative version of Binary Search.
    The list must be sorted to use binary search.
    '''
    
    low = 0
    high = len(L) - 1
    
    while low <= high: # stops when low and high cross
        mid = (low + high) // 2 # make sure we use intger division
        if key == L[mid]:
            return mid
        elif key < L[mid]:
            high = mid - 1
        else:
            low = mid + 1
            
    return -low - 1

def binarySearchR1(L, key, low, high):
    '''Recursive version of binary search'''
    
    # check base case first
    if low > high:
        return -low -1
    
    mid = (low + high) // 2
    if key == L[mid]:
        return mid
    elif key < L[mid]:
        return binarySearchR1(L, key, low, mid-1) # make high = mid - 1
    else:
        return binarySearchR1(L, key, mid+1, high) # make low = mid + 1
    

def binarySearchR2(L, key, low = None, high = None):
    '''
    This version of recursice binary search can be called without providing
    initial values for low and high.
    '''
    if low == None:
        return binarySearchR2(L, key, 0, len(L) - 1)
        
    # check base case first
    if low > high:
        return -low -1
    
    mid = (low + high) // 2
    if key == L[mid]:
        return mid
    elif key < L[mid]:
        return binarySearchR2(L, key, low, mid-1) # make high = mid - 1
    else:
        return binarySearchR2(L, key, mid+1, high) # make low = mid + 1

def main():
    L = [5, 10, 15, 20, 25, 30, 35]
    print(L)
    
    key = 37
    
    index = binarySearchI(L, key)
    # index = binarySearchR1(L, key, 0, len(L) - 1)
    # index = binarySearchR2(L, key)
    
    if index >= 0:
        print(f'key = {key}. Found at L[{index}]')
    else:
        print(f'key = {key} not Found. Add at L[{-index -1}]')    


main()
    