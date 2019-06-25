# leibniz.py

def leibniz(numTerms):
    piApprox = 0 # This is the accumulator
    
    # Values for the first term
    numerator = 4
    denominator = 1
    sign = 1
    
    for i in range(numTerms):
        term = sign*(numerator/denominator)
        piApprox += term
        
        # get ready for the next term
        denominator += 2
        sign = -sign
        
    return piApprox

def main():
    termCount = int(input('How many terms: '))
    
    approx = leibniz(termCount)
    print("Leibniz approximaton for pi is", approx)
    
main()