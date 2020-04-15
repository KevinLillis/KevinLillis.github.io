import sys

def fibRecursive(n):
    '''Computes fib(n) using recursion'''
    # check for the base case
    if n <= 1:
        return n
    
    return fibRecursive(n-1) + fibRecursive(n-2)

def fibIterative(n):
    '''Computes fib(n) using iteration'''
    if n <= 1:    # This is NOT a recursive base case
        return n
    
    prev1 = 1
    prev2 = 0
    
    for i in range(2, n+1):
        current = prev1 + prev2
        prev2 = prev1
        prev1 = current
        
    return current

def fibDynamic(n):
    '''Computes fib(n) using dynamic programming'''
    fibNumbers = [0, 1]
    
    for i in range(2, n+1):
        fibNumbers.append(fibNumbers[i-1] + fibNumbers[i-2])
        
    return fibNumbers[n]

   
def runFibFunction(fibFunction, n):
    '''Run the given fib function with the value of n'''
    print("Function:", fibFunction.__name__)
    
    width = len(str(n))
    
    for i in range(n+1):
        print(f'   Fibonacci({i:>{width}}) = {fibFunction(i)}')

def showUsage():
    '''Print a message that shows the user how to properly call this program'''
    print('\nERROR\n')
    print('Usage: python3 fib.py [D | I | R] n')
    print('       where:')
    print('       D is for Dynamic')
    print('       I is for Iterative')
    print('       R is for Recursive')
    print('       n is for the Fibonacci number')
    

def main():
    # Check that we have exactly two arguments
    numArgs = len(sys.argv)
    
    if numArgs != 3:
        showUsage()
        
    elif sys.argv[1] not in 'DIR' or len(sys.argv[1]) != 1:
        showUsage()
        
    elif not sys.argv[2].isdigit():
        showUsage()
        
    else:
        # Here we know the input is correctly formatted
        # Now we can call the fib fuction specified
        n = int(sys.argv[2])
        
        algo = sys.argv[1]
        
        if algo == 'D':
            runFibFunction(fibDynamic, n)
        elif algo == 'I':
            runFibFunction(fibIterative, n)
        else:
            runFibFunction(fibRecursive, n)
    
main()