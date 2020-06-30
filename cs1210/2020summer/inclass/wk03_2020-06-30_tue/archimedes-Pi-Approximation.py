# archimedes-Pi-Approximation.py
import math

def archimedes(numSides):
    return numSides * math.sin(math.radians(180/numSides))

def main():
    n = 7000000000000000000000000
    print(f'Archimedes pi approximation is {archimedes(n)}')
    
main()