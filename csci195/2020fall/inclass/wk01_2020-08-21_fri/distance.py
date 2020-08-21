# distance.py

def main():
    # Input
    speed = int(input('How fast were you going (MPH)? '))
    time = int(input('How many hours were you driving? '))
    
    # Process
    distance = speed * time
    
    # Output
    print(f'you traveled {distance} miles')
    
main()