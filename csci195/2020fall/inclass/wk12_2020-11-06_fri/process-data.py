# process-data.py

'''
Processes an input with the following format:
First line contains an integer n.
There are then n more lines, each containing a data value.
'''


def processData1(fileName):
    '''
    Read the entire file as a string (with \n at the end of each line).
    Split the string on \n. Puts each number in a list. Number are still strings
    Map int down list to convert each data item into an int
    Calculate max, min, average
    '''
    dataFile = open(fileName, 'r')

    # read in all data
    data = dataFile.read().strip()  # read data as a string, strip ending \n
    dataFile.close()

    values = data.split('\n')

    del(values[0])  # first line isn't data, it's the count

    values = list(map(int, values))

    return (max(values), min(values), sum(values) / len(values))


def processData2(fileName):
    '''
    Doesn't read entire data file at once. Reads one line at a time.
    Read first line to control loop.
    Read first data value to initialize largest, smallest, and total
    Read remaining values and update largest, smallest, and sum
    Calculate max, min, average
    '''
    dataFile = open(fileName, 'r')

    numValues = int(dataFile.readline())

    firstValue = int(dataFile.readline())
    largest = firstValue
    smallest = firstValue
    total = firstValue

    for i in range(numValues - 1):
        value = int(dataFile.readline())
        if value > largest:
            largest = value
        if value < smallest:
            smallest = value
        total += value

    average = total / numValues
    return (largest, smallest, average)


def main():
    fileName = 'myData.txt' #input('Enter file name: ')
    #largest, smallest, average = processData1(fileName)
    #print(f'Largest: {largest}\nSmallest: {smallest}\nAverage: {average:0.2f}')

    #print()

    largest, smallest, average = processData2(fileName)
    print(f'Largest: {largest}\nSmallest: {smallest}\nAverage: {average:0.2f}')


main()
