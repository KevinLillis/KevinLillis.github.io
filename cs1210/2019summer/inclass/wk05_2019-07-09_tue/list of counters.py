def main():
    minValue = 4
    maxValue = 8
    n = 6
    
    counts = [0] * (maxValue + 1)
    
    print(f'Entering {n} values')
    
    for i in range(n):
        value = int(input(f'Enter a number from {minValue} to {maxValue}: '))
        if minValue <= value <= maxValue:
            counts[value] += 1
        else:
            print('Invalid value was ignored')
            
    print('Here are the results')
    for i in range(minValue, maxValue + 1):
        print(f'{i} : {counts[i]}')
    
main()
