# cylinderVolume.py
import math

def main():
    r = float(input('Enter radius: '))
    h = float(input('Enter height: '))
    
    volume = math.pi * r**2 * h
    
    print(f'radius:{r} height:{h} volume:{volume}')
    
main()