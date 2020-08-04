# v3_pointTester.py

from v3_pointFile import *

def normalUse():
    p1 = point(2, 7)
    p2 = point() # Changed from v2
    
    print(p1)
    print(p2)
    
    message = 'p1: ' + str(p1)
    print(message)
    
    print(f'p2: {p2}')

def badUse():
    p3 = point('Iowa', ['a', 6, {}])
    print(p3)
    
def main():
    #normalUse()
    badUse()
main()