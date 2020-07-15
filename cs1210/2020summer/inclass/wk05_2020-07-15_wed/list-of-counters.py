# 

def main():
    n = int(input('How many numbers will you enter: '))
    minValue = int(input('Minimum value: '))
    maxValue = int(input('Maximum value: '))
    
    if minValue > maxValue:
        minValue, maxValue = maxValue, minValue
        
    invalidCount = 0 # an accumulator
    counts = [0] * (maxValue + 1)
    
    print(f'Entering {n} values')
    
    for i in range(1, n+1):
        value = int(input(f'{i:3}) Enter number from {minValue} to {maxValue}: '))
        
        if minValue <= value <= maxValue:
            # number is in the correct range. So count it.
            counts[value] += 1
        else:
            # invalid number
            invalidCount += 1
            
    print('Results')
    
    for value in range(minValue, maxValue + 1):
        print(f'{value:9} : {counts[value]:5}')
        
    print(f'{"invalid":>9} : {invalidCount:5}')
    
    print('Look at the wasted space at the beginning of the list')
    print(counts)
    
main()