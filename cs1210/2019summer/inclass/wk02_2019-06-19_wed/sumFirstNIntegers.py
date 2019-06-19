def total(n):
    '''Calculate and return the sum of the numbers 1 to n'''
    result = 0
    for num in range(1, n+1):
        result = result + num
        
    return result
    
def main():
    value = int(input("Enter a non-negative integer: "))
    answer = total(value)
    print('Sum from 1 to', value, 'is', answer)
    
main()