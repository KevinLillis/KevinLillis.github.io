# sumList2.py
# Passes indexes instead of making copies of the smaller lists
def sumList(L, low = None, high = None):
    if low == None:
        # if now equals None, then both low and high equal None
        low = 0
        high = len(L) - 1
        
    if low > high:
        # empty list
        return None
    
    if low == high:
        # list with one element
        return L[low]
    
    middle = (low + high) // 2
    return sumList(L, low, middle) + sumList(L, middle+1, high)

print(sumList([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]))
print(sumList(range(101)))
print(sumList([]))
print(sumList([4]))