# v5_pointTester.py

'''
Mutators and Acessors
'''
from v5_pointFile import *

def main():
    print('\nStarting')
    
    print('=' * 30)
    p = point(1, 2)
    print(f'Initial p: {p}')
    
    # Mutators
    print('\nMutators')

    print('=' * 30)
    p.setx(3)
    print(f'Set x to 3: {p}')
    
    print('=' * 30)
    p.sety(4)
    print(f'Set y to 4: {p}')
    
    print('=' * 30)
    p.setxy(5, 6)
    print(f'Set x, y to 5, 6: {p}')
    
    # Accessors
    print('\nAccessors')
    
    print('=' * 30)
    print(f'x = {p.x()}')
    print(f'Type of x is: {type(p.x()).__name__}')

    print('=' * 30)
    print(f'y = {p.y()}')
    print(f'Type of y is: {type(p.y()).__name__}')

    print('=' * 30)
    print(f'x and y = {p.getxy()}')
    print(f'Type returned is: {type(p.getxy()).__name__}')

main()