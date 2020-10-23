# dict-of-counters.py

# Uses a dictionary instead of a list for the counters

def main():

    minValue = int(input('Enter minimum value: '))
    maxValue = int(input('Enter maximum value: '))

    if minValue > maxValue:
        minValue, maxValue = maxValue, minValue

    n = int(input('How many number will you enter: '))

    invalidCount = 0
    counts = {}

    print(f'Entering {n} values')

    for i in range(1, n+1):
        value = int(
            input(f'{i:3}) Enter a number from {minValue} to {maxValue}: '))
        if minValue <= value <= maxValue:
            if value not in counts:
                # value is not in the dict, add it with count 1
                counts[value] = 1
            else:
                # value is already in the dict, increment the count by 1
                counts[value] += 1

        else:
            invalidCount += 1

    print('Results')
    for value in range(minValue, maxValue+1):
        if value in counts:
            print(f'{value:9} : {counts[value]:5}')
        else:
            print(f'{value:9} : {0:5}')
            

    print(f'{"invalid":>9} : {invalidCount:5}')

    # No more Wasted Space
    print()
    print('This is what the counts contains')
    print(counts)


main()
