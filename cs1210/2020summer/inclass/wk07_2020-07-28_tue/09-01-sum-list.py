def sumList(L):
    # Check for the base case first
    if L == []:
        return 0
    
    # If we are here, then L not equal to []
    firstItem = L[0]
    smallerListSum = sumList(L[1:])
    
    return firstItem + smallerListSum
    

def main():
    print(sumList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))

main()