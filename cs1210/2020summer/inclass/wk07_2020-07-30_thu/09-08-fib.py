import sys

def fibIterative(n):
    '''Use iteration. Saves only the previous two Fibonacci numbers each time'''
    if n == 0:
        return 0
    if n == 1:
        return 1
    
    prev2, prev1 = 0, 1
    current = prev2 + prev1
    for i in range(2, n+1):
        current = prev2 + prev1
        prev2 = prev1
        prev1 = current
        
    return current

def fibDynamic(n):
    '''Use Dynamic Programming. Store all previous Fibonacci numbers in a list'''
    if n == 0:
        return 0
    if n == 1:
        return 1
    
    # Initial two values in our list
    fib = [0, 1]

    # Append next value in list using previous two values
    for i in range(2, n+1):
        fib.append(fib[i-1] + fib[i-2])
        
    return fib[n]
    
def fibRecursive(n):
    '''Use Recursion to compute Fibonacci number n'''
    if n == 0:
        return 0
    if n == 1:
        return 1
    
    return fibRecursive(n-1) + fibRecursive(n - 2)
    
def runFunction(fibFunction, n):
    ''' Run the given function using parameter n.'''
    
    print(fibFunction.__name__)
    
    for i in range(n + 1):
        width = len(str(n))
        print(f'  ({i:>{width}}) = {fibFunction(i)}')

def showUsage():
    '''Show the user how to properly call this program'''
    print('\nERROR\n')
    print('Usage: python3 fib.py [D | I | R] n')
    print('   Where:')
    print('      D is for Dynamic')
    print('      I is for Iterative')
    print('      R is for Recursive')
    print('      n is how many Fibonacci numbers to compute')

def main():
    # Check to see if the correct number of arguments are provided
    numArgs = len(sys.argv) # this variable is often called "argc"
    
    if numArgs != 3:
        showUsage()
    
    else:
        # Check to see that n can be converted to an int
        if not sys.argv[2].isdigit():
            showUsage()
        else:
            n = int(sys.argv[2])
            
            # Check to see that the algorithm specified is D, I, or R
            algo = sys.argv[1]
            if algo == 'D':
                runFunction(fibDynamic, n)
            elif algo == 'I':
                runFunction(fibIterative, n)
            elif algo == 'R':
                runFunction(fibRecursive, n)
            else:
                showUsage()
        
main()