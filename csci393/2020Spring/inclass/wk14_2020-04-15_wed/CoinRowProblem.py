# File: CoinRowProblem.py

def main():
    C = [0, 5, 1, 2, 10, 6, 2] # From class example
#    C = [0, 10, 1, 2, 3, 11] # include first and last
#    C = [0, 10, 1, 3, 11] # include ONLY first and last
#    C = [0, 10, 1, 12, 3] # use first but NOT the last
#    C = [0, 1, 10, 11, 12, 3] # Use neither the first nor the last
#    C = [0, 8] # Just one coin
    
    n = len(C) - 1 # number of coins. Remember, C[0] is not used.
    F = [0 for i in range(len(C))]
    
    # These two lists are for recovering the solution
    usedCoin = [False for i in range(len(C))]
    cameFrom = [0 for i in range(len(C))] # record the previous step
    
    # Compute the value of the maximum solution
    # record how the solution was obtained
    
    F[0] = 0
    F[1] = C[1]
    
    # This if statement fixed the problem of printing the
    # coins when n = 1
    if n==1:
        usedCoin[1] = True 
    
    for i in range(2, n+1): # i goes from 2 to n
        if C[i] + F[i-2] > F[i-1]:
            F[i] = C[i] + F[i-2]
            usedCoin[i] = True
            cameFrom[i] = i-2
        else:
            F[i] = F[i-1]
            usedCoin[i] = False
            if i == 2:
                usedCoin[1] = True
            
            cameFrom[i] = i-1
    
    print('-------------------------')
    print('i   C[i]  F[i] From   Used')
    
    for i in range(n+1): 
        print(f'{i}) {C[i]:3} {F[i]:5} {cameFrom[i]:5}   {usedCoin[i]}')

    print('-------------------------')
    
    print(f'Value of optimal solution is {F[n]}')
    
    # Recover the solution
    solution = []
    i = n
    while i > 0:
        if usedCoin[i]:
            solution = [f'c{i}({C[i]})'] + solution
          
        i = cameFrom[i]
        
    print()
    print('Coins in the optimal solution:')
    print(', '.join(solution))
    
    
    
main()