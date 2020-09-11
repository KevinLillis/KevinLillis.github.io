# LeibnizPiApprox.py

def leibniz1(numTerms):
    acc = 0
    
    # Values for the first term
    numerator = 4
    denominator = 1
    sign = 1
    
    for i in range(numTerms):
        term = sign * (numerator / denominator)
        acc += term
        
        # Get ready for the next term
        denominator += 2
        sign = -sign
        
    return acc

def main():
    piApprox = leibniz1(10000)
    print(piApprox)
    
main()