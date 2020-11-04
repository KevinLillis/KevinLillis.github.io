# readData.py

def main():
    inFile = open('myData.txt', 'r')
    
    numValues = int(inFile.readline())
    
    first = int(inFile.readline())
    total = largest = smallest = first
    
    # The problem in class was that I forgot to put the "- 1" in the
    # range on the next line. Why do we need it? Since we read the first
    # data value before the for loop (see line 8 above) we need to read
    # one fewer lines in the loop.
    for i in range(numValues - 1):
        num = int(inFile.readline())
        total += num
        if num > largest:
            largest = num
        if num < smallest:
            smallest = num
            
    average = total / numValues
        
    print(f'{total=}\n{largest=}\n{smallest=}\n{average=}')
    
main()