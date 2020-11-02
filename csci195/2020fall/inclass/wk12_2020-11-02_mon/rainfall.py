# rainfall.py

def rainFall_1(inFileName):
    '''
    Print all of the cities and compute total rainfall.
    '''
    inFile = open(inFileName, 'r')
    totalRain = 0
        
    for line in inFile:
        city, inches = line.split()
        print(f'{city} had {inches} inches of rain.')
        totalRain += float(inches)
        
    inFile.close()
    
    print(f'Total rain is {totalRain}')
    
def rainFall_2(inFileName):
    '''
    Same as function 1, but format the output into collumns.
    '''
    totalRain = 0
    longestCityLen = 0
    data = []

    inFile = open(inFileName, 'r')
       
    # read all data into a list and then close the data file 
    for line in inFile:
        city, inches = line.split()
        inches = float(inches)
        
        if len(city) > longestCityLen:
            longestCityLen = len(city)
            
        totalRain += inches
        
        data.append((city, inches))

    inFile.close()

    # display the results
    for city, inches in data:
        print(f'{city:{longestCityLen}} had {inches:5.2f} inches of rain')
        
    print(f'Total rain: {totalRain:5.2f}')

def rainFall_3(inFileName):
    '''
    File the city with the most rainfall.
    '''
    maxRain = 0
    cityWithMaxRain = None
        
    inFile = open(inFileName, 'r')
    
    for line in inFile:
        city, inches = line.split()
        inches = float(inches)
        if inches > maxRain:
            maxRain = inches
            cityWithMaxRain = city
        
    inFile.close()
    
    print(f'{cityWithMaxRain} has the most rain; it had {maxRain} inches.')

def rainFall_4(inFileName, outFileName):
    '''
    Create a new data file where the amount of rain is given in CM
    instead of inches,
    '''
    inFile = open(inFileName, 'r')
    outFile = open(outFileName, 'w')
    
    for line in inFile:
        # read the next line and convert inches to cm
        city, inches = line.split()
        cm = 2.54 * float(inches)
        
        # Write the next line to the output file
        print(f'{city} {cm:.2f}', file = outFile)
    
    inFile.close()
    outFile.close()

def rainFall_5(inFileName, outFileName):
    '''
    Write the original data as a CSV file.
    '''
    
    inFile = open(inFileName, 'r')
    outFile = open(outFileName, 'w')
    
    for line in inFile:
        # read the next line and convert inches to cm
        city, inches = line.split()
        
        # Write the next line to the output file
        print(f'{city},{inches}', file = outFile)
    
    inFile.close()
    outFile.close()

def main():
    #rainFall_1('rainfall.txt')
    #rainFall_2('rainfall.txt')
    #rainFall_3('rainfall.txt')
    #rainFall_4('rainfall.txt', 'rainfallCM.txt')
    rainFall_5('rainfall.txt', 'rainfall.csv')
    
main()