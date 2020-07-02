# count-odd-even.py

import random

def main():
    oddCount = evenCount = 0
    
    for i in range(10000):
        x = random.randint(1, 100)
        
        if x % 2 == 0:
            evenCount += 1
        else:
            oddCount += 1
            
    print(f'Odds: {oddCount}   Evens: {evenCount}')
        
main()