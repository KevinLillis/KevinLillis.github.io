def largestA(L):
    '''return the largest element in a list using recursion'''
    
    # Check for the base case
    if len(L) == 1:
        return L[0]
    
    else:
        smallerL = L[1:]
        smallerSOL = largestA(smallerL)
        if L[0] > smallerSOL:
            return L[0]
        else:
            return smallerSOL

def largestB(L):
    '''return the largest element in a list using recursion'''
    
    # This really isn't a base case. It is included to handle the invalid
    # input of an empty list.
    if L == []:
        return 0
    
    # Check for the base case
    if len(L) == 1:
        return L[0]
    
    
    smallerL = L[1:]
    smallerSOL = largestB(smallerL)
    if L[0] > smallerSOL:
        return L[0]
    else:
        return smallerSOL
        

def largestC(L):
    '''return the largest element in a list using recursion'''
    
    # This really isn't a base case. It is included to handle the invalid
    # input of an empty list.
    if L == []:
        return 0
    
    # Check for the base case
    if len(L) == 1:
        return L[0]
    
    return max(L[0], largestC(L[1:]))
    

def largestD(L, i=0):
    '''
    return the largest element in a list using recursion.
    This time we don't make a copy of the list for each recursive call.
    '''
    
    # Check for the base case
    if i == len(L) - 1:
        return L[i]
    
    smallerSOL = largestD(L, i+1)
    if L[i] > smallerSOL:
        return L[i]
    else:
        return smallerSOL
    
def main():
    values = [3]
    #answer = largestA(values)
    #answer = largestB(values)
    #answer = largestC(values)
    answer = largestD(values)
    print(f'Largest is {answer}')
    
main()