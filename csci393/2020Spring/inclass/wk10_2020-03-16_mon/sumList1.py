# sumList1.py
# Makes copies of smaller lists
def sumList(L):
    if len(L) == 0:
        return None
    
    if len(L) == 1:
        return L[0]
    
    firstHalf = L[:len(L)//2]   # These two lines make a copy of the list
    secondHalf = L[len(L)//2:]  # This is not constant time
    
    return sumList(firstHalf) + sumList(secondHalf) # This is constant time
    
print(sumList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
print(sumList(range(101)))
print(sumList([]))
print(sumList([4]))