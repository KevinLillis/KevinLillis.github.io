# dict-of-counters.py
def main():

    minValue = int(input('Enter minimum value: '))
    maxValue = int(input('Enter maximum value: '))

    if minValue > maxValue:
        minValue, maxValue = maxValue, minValue

    n = int(input('How many number will you enter: '))

    invalidCount = 0
    counts = {}  # this is a dictionary

    print(f'Entering {n} values')

    for i in range(1, n+1):
        value = int(
            input(f'{i:3}) Enter a number from {minValue} to {maxValue}: '))
        if minValue <= value <= maxValue:
            if value in counts:
                counts[value] += 1
            else:
                counts[value] = 1
        else:
            invalidCount += 1

    print('Results')
    for i in range(minValue, maxValue+1):
        print(f'{i:9} : {counts[i]:5}')

    print(f'{"invalid":>9} : {invalidCount:5}')

    # No Wasted Space
    print(counts)


main()
