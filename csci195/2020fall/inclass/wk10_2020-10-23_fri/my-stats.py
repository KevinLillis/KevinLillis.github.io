# my-stats.py

# ------------------------------------------------------------------
# Dispersion (range)
def getDispersion1(L):
    return max(L) - min(L)

def getDispersion2(L):
    return getMax(L) - getMin(L)

def getMax(L):
    maxSoFar = L[0]
    
    for item in L:
        if item > maxSoFar:
            maxSoFar = item
            
    return maxSoFar

def getMin(L):
    minSoFar = L[0]
    
    for item in L:
        if item < minSoFar:
            minSoFar = item
            
    return minSoFar

def getDispersion3(L):
    maxSoFar = minSoFar = L[0]
    for item in L:
        if item > maxSoFar:
            maxSoFar = item
        if item < minSoFar:
            minSoFar = item
    
    return maxSoFar - minSoFar

# ------------------------------------------------------------------
# Mean (average)

def getMean1(L):
    return sum(L) / len(L)

def getMean2(L):
    return getSum(L) / getLen(L)

def getSum(L):
    total = 0
    for value in L:
        total += value
    return total

def getLen(L):
    length = 0
    for value in L:
        length += 1
    return length

# ------------------------------------------------------------------
# Median (middle value)
def getMedian(L):
    # Make a sorted copy so we don't mess up L when we sort
    L1 = sorted(L)
    
    if len(L1) % 2 == 1:
        # Odd Length List
        middleIndex = len(L1) // 2
        median = L1[middleIndex]
    else:
        # Even Length List
        middleLIndex = len(L1) // 2 - 1
        middleRIndex = len(L1) // 2
        
        middleLValue = L1[middleLIndex]
        middleRValue = L1[middleRIndex]
        median = (middleLValue + middleRValue) / 2
    
    return median

# ------------------------------------------------------------------
# Mode
def getMode(L):
    # Count how many ties each value appears in the list
    countDict = {}
    for value in L:
        if value in countDict:
            countDict[value] += 1
        else:
            countDict[value] = 1
            
    # Find the largest count
    maxCount = max(countDict.values())
    
    # Find all the keys that have the max count, add each one to the result
    modeList = [value for value, count in countDict.items() if count == maxCount]


    #modeList = [] # this has all of the values with the max count
    #for value, count in countDict.items():
        #if count == maxCount:
            #modeList.append(value)

    return modeList

def main():
    quakes = [20, 32, 21, 26, 33, 22, 18]
    print('=' * 60)
    dispersion1 = getDispersion1(quakes)
    dispersion2 = getDispersion2(quakes)
    dispersion3 = getDispersion3(quakes)
    
    print(f'Dispersion: {dispersion1}')
    print(f'Dispersion: {dispersion2}')
    print(f'Dispersion: {dispersion3}')
    
    print('=' * 60)
    mean1 = getMean1(quakes)
    mean2 = getMean2(quakes)
    
    print(f'Mean: {mean1}')
    print(f'Mean: {mean2}')
    
    print('=' * 60)
    median = getMedian(quakes)
    print(f'Median: {median}')
    
    print('=' * 60)
    quakes = [1, 1, 2, 3, 3]
    mode = getMode(quakes)
    print(f'Mode: {mode}')

main()