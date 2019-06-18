# Volume of right circular cone
import math
def main():
    height = float(input('Enter height: '))
    radius = float(input('Enter radius: '))
    
    volume = math.pi * radius**2 * (height/3)
    
    print('volume =', volume)
    
main()