# This program uses a main() function.
# This is how your programs are to be organized.

def main():
    height = float(input('Enter the height: '))
    width = float(input('Enter the width: '))
    
    area = height * width
    perimeter = 2*(height + width)
    
    print('area is', area, ' and perimeter is', perimeter)   
    
main()