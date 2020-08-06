# v8_pointTester.py
'''
  Changed p.setx(#) to p[0] = # and p[-2] = #
  Changed p.sety(#) to p[1] = # and p[-1] = #
'''
from v8_pointFile import *
    
def main():
    print('\nStarting')
    
    print('=' * 30)
    p = point(1, 2)
    print(f'initial p: {p}')
    
    # Mutators
    print('\nMutators')
    
    print('=' * 30)
    p[0] = 3
    print(f'Set x to 3: {p}')
    
    print('=' * 30)
    p[1] = 4
    print(f'Set y to 4: {p}')

    print('=' * 30)
    p.setxy(5, 6)
    print(f'Set x, y to 5, 6: {p}')
    
    print('=' * 30)
    p[-2] = 7
    print(f'Set x to 7: {p}')
    
    print('=' * 30)
    p[-1] = 8
    print(f'Set y to 8: {p}')

    
    # Accessors
    print('\nAccessors')
    
    print('=' * 30)
    print(f'x = {p[0]}')
    print(f'type of x is: {type(p[-2]).__name__}')
    
    print('=' * 30)
    print(f'y = {p[1]}')
    print(f'type of y is: {type(p[-1]).__name__}')
    
    print('=' * 30)
    print(f'x and y = {p.getxy()}')
    print(f'type returned is: {type(p.getxy()).__name__}')    
    
main()