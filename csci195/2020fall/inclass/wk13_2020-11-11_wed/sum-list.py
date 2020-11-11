# sum-list.py

def sumList(L):
    # check for base case
    if L == []:
        return 0
    
    return L[0] + sumList(L[1:])

def main():
    print(sumList([12, 3]))

main()