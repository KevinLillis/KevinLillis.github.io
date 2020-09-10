import math

def archimedes(numSides):
    return numSides * math.sin(math.radians(180/numSides))

def main():
    n = 10000000000000000000
    print(archimedes(n))

main()