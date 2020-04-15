'''
     n choose k    =  bin(n, k)          Fact       Rec     Dynamic 
    10 choose 5    =    252              good      good       good
    20 choose 10   =  184,756            good      good       good
    40 choose 20   = 137,846,528,820     good    too long     good

    80 choose 40   = 107,507,208,733,336,176,461,620
                                         good    too long     good
                                         
    200 choose 100   = 
    90,548,514,656,103,281,165,404,177,077,484,163,874,504,589,675,413,336,841,320
                                         good    too long     good
'''

from math import factorial
def main():
    n, k = 10, 5
    
    print(n,'choose',k)
    print(f'Factorials : {binomialFact(n,k):,}')
    print(f'Recursive  : {binomialRec(n,k):,}')
    print(f'Dynamic    : {binomialDynamic(n,k):,}')

# Using Factorials
def binomialFact(n, k):
    return factorial(n) // (factorial(k) * factorial(n - k))

# Using Recursion
def binomialRec(n, k):
    if k == 0 or n == k:
        return 1
    
    return binomialRec(n-1, k-1) + binomialRec(n-1, k)

# Using Dynamic Programming
def binomialDynamic(N, K):
    tri = [[1]*i for i in range(1,N+2)] # starting at 1 and want N+1 rows
    
    for n in range(2,N+1): # row 2 to row N
        for k in range(1, len(tri[n])-1):
            tri[n][k] = tri[n-1][k-1] + tri[n-1][k]
            
    return tri[N][K]
        
def printTri(tri):
    for row in tri:
        print(row)
        
    
main()