def fibRecursive(n):
    # check for base case
    if n <= 1:
        return n
    
    return fibRecursive(n-1) + fibRecursive(n-2)


def fibIterative(n):
    if n <= 1:  # This is NOT a recursive base case
        return n

    prev1 = 1
    prev2 = 0
    
    for i in range(2, n+1):
        current = prev1 + prev2
        prev2 = prev1
        prev1 = current
        
    return current

def fibDynamic(n):
    fibNumbers = [0, 1]
    
    for i in range(2, n+1):
        fibNumbers.append(fibNumbers[i-1] + fibNumbers[i-2])
        
    return fibNumbers[n]
    
def main():
    lastN = 10
    
    print('Dynamic')
    for n in range(0, lastN + 1):
        print(f'fib({n}) = {fibDynamic(n)}')
        
    print('\nIterative')
    for n in range(0, lastN + 1):
        print(f'fib({n}) = {fibIterative(n)}')

    print('\nRecursive')
    for n in range(0, lastN + 1):

        print(f'fib({n}) = {fibRecursive(n)}')
    
main()