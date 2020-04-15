# File: Counting Sort
import random

def main():
    maxValue = 500
    numValues = 10000
    numbers = [random.randint(1,maxValue) for i in range(numValues)]
    
    #print(numbers)
    
    if isSorted(numbers):
        print('before: Sorted')
    else:
        print('before: Unsorted')
        
    countingSort(numbers, maxValue)
    
    #print(numbers)
    
    if isSorted(numbers):
        print('after: Sorted')
    else:
        print('after: Unsorted')
    

def countingSort(L, k):
    count = [0 for i in range(len(L))]
    
    for num in L:
        count[num] += 1
        
    i = 0
    for value in range(1, k+1):
        for j in range(count[value]):
            L[i] = value
            i += 1
        

def isSorted(L):
    for i in range(len(L) - 1):
        if L[i] > L[i+1]:
            return False
        
    return True

main()