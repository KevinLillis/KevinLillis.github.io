# wallis.py

def wallis(numPairs):
    product = 1 # This is the accumulator
    numerator = 2
    
    for i in range(numPairs):
        leftTerm = numerator / (numerator - 1)
        rightTerm = numerator / (numerator + 1)
        
        product = product * leftTerm * rightTerm
        
        # Get ready for the next two terms
        numerator += 2
        
    piApprox = 2 * product
    
    return piApprox

def main():
    pairCount = int(input('How many pairs: '))
    approx = wallis(pairCount)
    
    print("Pi approximation is", approx)
    
main()