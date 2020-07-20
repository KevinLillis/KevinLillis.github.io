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


# ------------------------------------------------------------------------------
# Mean

def getMean1(L):
    return sum(L) / len(L)

def getSum(L):
    total = 0
    for num in L:
        total += num
    return total

def getLen(L):
    count = 0
    for num in L:
        count += 1
    return count

def getMean2(L):
    return getSum(L) / getLen(L)

# ------------------------------------------------------------------------------
# Median

def getMedian(L):
    # Make a copy of L before sorting the data
    L1 = sorted(L)
    
    if len(L1) % 2 == 1:
        # L1 is odd length
        median = L1[len(L1) // 2]
    else:
        # L1 is even length
        middleL = L1[len(L1) // 2 - 1]
        middleR = L1[Len(L1) // 2]
        median = (middleL + middleR) / 2
        
    return median
    
# ------------------------------------------------------------------------------
# Median

def getMode(L):
    # Count how many times each item appears in the list
    countDict = {}
    for item in L:
        if item in countDict:
            countDict[item] += 1
        else:
            countDict[item] = 1
            
    # Find the largest count
    maxCount = max(countDict.values())
    
    # Find all items that have the largest count & add each on the the result
    # this is how we did modeList in class:
    '''
    modeList = []
    for item, count in countDict.items():
        if count == maxCount:
            modeList.append(item)
    '''
    
    # this is how it can be done using list comprehension
    modeList = [item for item,count in countDict.items() if count == maxCount]
    
    return modeList
    
def main():
    quakes = [20, 32, 21, 26, 33, 22, 18]
    
    dispersion = getDispersion1(quakes)
    print(f'Dispersion : {dispersion}')

    dispersion = getDispersion2(quakes)
    print(f'Dispersion : {dispersion}')
    
    print('-' * 30)
    mean = getMean1(quakes)
    print(f'mean : {mean}')
    
    mean = getMean2(quakes)
    print(f'mean : {mean}')

    print('-' * 30)
    median = getMedian(quakes)
    print(f'median : {median}')
    
    print('-' * 30)
    mode = getMode(quakes)
    print(f'mode : {mode}')

main()