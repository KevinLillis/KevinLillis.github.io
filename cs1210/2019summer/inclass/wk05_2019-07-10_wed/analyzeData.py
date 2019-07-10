def calcRange(L):
    return max(L) - min(L)

def calcRange2(L):
    return myMax(L) - myMin(L)

def myMax(L):
    largest = L[0]
    for value in L:
        if value > largest:
            largest = value
    return largest
    
def myMin(L):
    smallest = L[0]
    for value in L:
        if value < smallest:
            smallest = value
    return smallest

def calcMean(L):
    # the average
    return sum(L) / len(L)
    
def calcMean2(L):
    # the average
    return mySum(L) / myLen(L)

def mySum(L):
    total = 0
    for value in L:
        total += value
        
    return total

def myLen(L):
    length = 0
    for x in L:
        length += 1
        
    return length

def calcMedian(L):
    # sort the list first
    sortedL = sorted(L)
    
    # see if the list is odd or even length
    if len(L) % 2 == 1:
        # list is odd length
        return sortedL[len(sortedL) // 2]
    else:
        # list is even length
        indexA = len(sortedL) // 2
        indexB = indexA - 1
        
        middleA = sortedL[indexA]
        middleB = sortedL[indexB]
        
        return (middleA + middleB) / 2
    

def main():
    data = [20, 32, 65, 19, 12, 18, 24]
    
    print(f'range: {calcRange(data)}')
    print(f'range: {calcRange2(data)}')
    print(f'mean: {calcMean(data)}')
    print(f'mean: {calcMean2(data)}')
    print(f'median: {calcMedian(data)}')
    
main()