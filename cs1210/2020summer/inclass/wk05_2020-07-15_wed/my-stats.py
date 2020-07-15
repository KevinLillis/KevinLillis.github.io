# my-stats.py

def getDispersion1(L):
    return max(L) - min(L)

def getMax(L):
    maxSoFar = L[0]
    for item in L:
        if item > maxSoFar:
            # we have a new max value
            maxSoFar = item
    
    return maxSoFar

def getMin(L):
    minSoFar = L[0]
    for item in L:
        if item < minSoFar:
            # we have a new min value
            minSoFar = item
    
    return minSoFar

def getDispersion2(L):
    return getMax(L) - getMin(L)

def main():
    quakes = [20, 32, 21, 26, 33, 22, 18]
    
    dispersion = getDispersion1(quakes)
    print(f'Dispersion : {dispersion}')

    dispersion = getDispersion2(quakes)
    print(f'Dispersion : {dispersion}')
    
main()