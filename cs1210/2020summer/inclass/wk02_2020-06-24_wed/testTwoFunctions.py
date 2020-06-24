# testTwoFunctions.py
import twoFunctions_2 as twoFun

def main():
    value = 5
    result = twoFun.isEven(value)
    print(f'twoFun.isEven({value}) returned {result}')

    value = 6
    result = twoFun.isEven(value)
    print(f'twoFun.isEven({value}) returned {result}')

    value = 7
    result = twoFun.double(value)
    print(f'twoFun.double({value}) returned {result}')
    
    value = 'Clemenza'
    result = twoFun.double(value)
    print(f'twoFun.double({value}) returned {result}')
    
main()