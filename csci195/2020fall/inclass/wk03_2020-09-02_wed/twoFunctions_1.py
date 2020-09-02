# twoFunctions_1.py

def isEven(x):
    '''
    Example of a function that takes one parameter/argument and returns
    a value.
    
    Returns True if x is even.
    Returns False if x is odd.
    '''
    return x % 2 == 0


def double(param):
    '''
    Example of a function that takes one parameter/argument
    and returns a value.
    '''
    return param + param
    
def main():
    value = 8
    result = isEven(value)
    print(f'isEven({value}) retrurned: {result}')

    value = 7
    result = isEven(value)
    print(f'isEven({value}) retrurned: {result}')


    value = 9
    result = double(value)
    print(f'double({value}) retrurned: {result}')

    value = 'SAU'
    result = double(value)
    print(f'double({value}) retrurned: {result}')

main()