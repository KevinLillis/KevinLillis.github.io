def rainfallA(fileName):
    '''Compute total rainfall'''
    totalRain = 0
    inFile = open(fileName, 'r')
    
    # Read in the data one line at a time
    for line in inFile:
        city, inches = line.split()
        print(f'{city} had {inches} inches of rain')
        totalRain += float(inches)
        
    inFile.close()
    
    print(f'Total inches of rain is {totalRain:6.2f}')
       
def maxRainFall(fileName):
    '''Which city had the most rain'''
    maxRain = -1 # Assumes all rainfall values are non-negative
    maxCity = '' # The name of the city with the most rainfall
    
    inFile = open(fileName, 'r')
    
    for line in inFile:
        city, inches = line.split()
        inches = float(inches)
        if inches > maxRain:
            maxRain = inches
            maxCity = city
            
    inFile.close()
    
    print(f'{maxCity} had the most rain.')
    
def rain_inches_to_cm(inFileName, outFileName):
    '''Create a new file with rainfall data in cm instead of inches'''
    inFile = open(inFileName, 'r')
    outFile = open(outFileName, 'w')
    
    for line in inFile:
        # Read the next line and convert inches to cm
        city, inches = line.split()
        cm = 2.54 * float(inches)
        
        # Write the next line to the output file
        print(f'{city} {cm:.2f}', file=outFile)
        
    inFile.close()
    outFile.close()
        
        
def makeCSV(inFileName):
    '''Read a txt file, save it as a csv file. Use the same name as the input
    file, only change the extension from "txt" to "csv"'''
    
    # Construct the name of the output file
    name, extension = inFileName.split('.')
    outFileName = name + '.csv'
    
    # Open the files
    inFile = open(inFileName, 'r')
    outFile = open(outFileName, 'w')
    
    for line in inFile:
        city, inches = line.split()
        print(f'{city},{inches}', file = outFile)
        
    inFile.close()
    outFile.close()
    
    
def main():
    #rainfallA('rainfall.txt')
    
    fileName = 'rainfall.txt'
    #maxRainFall(fileName)
    
    #inFileName = 'rainfall.txt'
    #outFileName = 'rainFallCM.txt'
    #rain_inches_to_cm(inFileName, outFileName)
    
    makeCSV('rainfall.txt')
    
main()