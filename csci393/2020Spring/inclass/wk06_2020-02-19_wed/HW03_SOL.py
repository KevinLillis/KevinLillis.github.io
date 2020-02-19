import time
    
def main():
    lengths = [150, 300, 450, 600, 750, 900, 1050, 1200, 1350, 1500, 1650, 1800]
    lengths += [1950, 2100, 2250, 2400, 2550, 2700, 2850, 3000, 3150, 3300]
    lengths += [3450, 3600, 3750, 3900, 4050, 4200, 4350, 4500, 4650, 4800]
    lengths += [4950, 5100, 5250, 5400, 5550, 5700, 5850, 6000]
    
    outFile = open('results.csv', 'w')
    print("n,Time", file = outFile)
    
    for length in lengths:
        print(f'length {length}')
        L = getList(length)
        
        start = time.time()
        uniqueElemets(L)
        stop = time.time()
        
        elapsed = stop - start
        print(length, elapsed, sep = ',', file = outFile)
        
    outFile.close()
    
def uniqueElemets(L):
    n = len(L);
    for i in range(n-1):
        for j in range(i+1,n):
            if L[i]  == L[j]:
                return False
    return True 

def getList(length):
    L = list(range(length))
    return L

main()