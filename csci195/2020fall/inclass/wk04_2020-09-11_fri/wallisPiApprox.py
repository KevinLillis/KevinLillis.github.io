# wallisPiApprox.py

def wallis(numPairs):
    acc = 1
    
    numerator = 2
    
    for pair in range(numPairs):
        leftTerm = numerator / (numerator - 1)
        rightTerm = numerator / (numerator + 1)
        
        acc = acc * leftTerm * rightTerm
        
        numerator += 2
        
    piApprox = 2 * acc
    
    return piApprox

def main():
    myPi = wallis(100000)
    print(myPi)
    
main()
