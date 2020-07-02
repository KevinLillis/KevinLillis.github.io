# montePi.py

import random

def montePi(numDarts):
    '''Do a Monte Carlo simulation to approximate pi'''
    
    numInCircle = 0
    
    for i in range(numDarts):
        # Throw a dart
        x = random.uniform(-1, 1)
        y = random.uniform(-1, 1)
        
        # Count this dart if it lended inside the circle
        if x*x + y*y <= 1:
            numInCircle += 1
            
    piApprox = 4 * (numInCircle / numDarts)
    return piApprox
def main():
    numDarts = int(input('How many darts: '))
    pi = montePi(numDarts)
    print(f'Approximate value of pi is {pi}')
    
main()