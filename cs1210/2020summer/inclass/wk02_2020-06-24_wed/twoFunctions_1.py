# twoFunctions_1.py

def isEven(x):
    return x % 2 == 0

def double(param):
    return param + param
    
def main():
    value = 5
    result = isEven(value)
    print(f'isEven({value}) returned {result}')

    value = 6
    result = isEven(value)
    print(f'isEven({value}) returned {result}')

    value = 7
    result = double(value)
    print(f'double({value}) returned {result}')
    
    value = 'Clemenza'
    result = double(value)
    print(f'double({value}) returned {result}')

main()    
    