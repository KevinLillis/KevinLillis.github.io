# distance.py
def main():
    # Input
    speed = int(input('How fast were you going (MPH): '))
    time = int(input('How many hour were you driving: '))
        
    # Process
    distance = speed * time
    
    # Output
    print(f'You traveled {distance} miles.')
    
main()