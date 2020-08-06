# v9_pointTester.py
'''
  point + point
  point + list
  point + tuple
  
  list + point
  tuple + point
'''

from v9_pointFile import *
    
def main():
    p1 = point(1, 2)
    p2 = point(3, 4)
    L = [5, 6]
    T = (7, 8)

    # point + point
    print('=' * 30)
    print('point + point  uses __add__')
    print(f'{p1} + {p2} = {p1 + p2}')
    print(f'{p2} + {p1} = {p2 + p1}')
    
    # point + list
    print('=' * 30)
    print('point + list  uses __add__')
    print(f'{p1} + {L} = {p1 + L}')
    
    # point + tuple
    print('=' * 30)
    print('point + tuple  uses __add__')
    print(f'{p1} + {T} = {p1 + T}')


    # list + point
    print('=' * 30)
    print('list + point  uses __radd__')
    print(f'{L} + {p1} = {L + p1}')
    
    # tuple + point
    print('=' * 30)
    print('tuple + point  uses __radd__')
    print(f'{T} + {p1} = {T + p1}')


main()