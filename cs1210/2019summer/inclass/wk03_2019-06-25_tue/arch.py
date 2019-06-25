# arch.py

import math

def arch1(numSides):
    piApprox = numSides * math.sin(math.radians(180)/numSides)
    return piApprox
    
def arch2(numSides):
    theta = 360 / numSides
    theta = math.radians(theta)
    
    sideLen = 2 * math.sin(theta/2)
    polygonCirc = numSides * sideLen
    
    piApprox = polygonCirc / 2
    
    return piApprox
    
def main():
    sideCount = int(input('How many sides: '))
    myApprox = arch2(sideCount)
    print('Pi approximation is', myApprox)
    
main()