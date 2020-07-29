# Smallest item in list
def smallest1(L):
    # check for base case
    if len(L) == 1:
        return L[0]
    
    firstNum = L[0]
    otherSmallNum = smallest1(L[1:])
    
    if firstNum < otherSmallNum:
        return firstNum
    else:
        return otherSmallNum

def smallest2(L):
    # Check for base case
    if len(L) == 1:
        return L[0]
    
    return min(L[0], smallest2(L[1:]))

def main():
    myList = [3,2,4,2,5,6,1]
    print(f'Smallest item from {myList} is {smallest1(myList)}')
    print(f'Smallest item from {myList} is {smallest2(myList)}')

main()