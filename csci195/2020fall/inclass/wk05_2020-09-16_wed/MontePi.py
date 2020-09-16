# MontePi.py
import random

def montePi(numDarts):
    numInCircle = 0
    
    for i in range(numDarts):
        # Throw a dart
        x = random.uniform(-1, 1)
        y = random.uniform(-1, 1)
        
        # Count it if it landed inside the circle
        if x*x + y*y <= 1:
            numInCircle += 1
            
    piApprox = (numInCircle / numDarts) * 4
    return piApprox

def main():
    numThrows = int(input('How many darts: '))
    
    pi = montePi(numThrows)
    print(f'Approximate value of pi is {pi}')
    
main()