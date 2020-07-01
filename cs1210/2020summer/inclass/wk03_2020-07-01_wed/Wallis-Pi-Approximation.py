# Wallis-Pi-Approximation.py

def wallis1(numPairs):
    acc = 1
    numerator = 2
    
    for i in range(numPairs):
        leftTerm = numerator / (numerator - 1)
        rightTerm = numerator / (numerator + 1)
        
        acc = acc * leftTerm * rightTerm
        
        numerator += 2
        
    pi = 2 * acc
    return pi

def wallis2(numPairs):
    acc = 1
    
    for i in range(numPairs):
        numerator = 2 * i + 2
        leftDenominator = 2 * i + 1
        rightDenominator = 2 * i + 3
        
        leftTerm = numerator / leftDenominator
        rightTerm = numerator / rightDenominator
        
        acc = acc * leftTerm * rightTerm
        
    pi = 2 * acc
    return pi

def main():
    numPairs = 999999
    print(wallis1(numPairs))
    print(wallis2(numPairs))
    
main()