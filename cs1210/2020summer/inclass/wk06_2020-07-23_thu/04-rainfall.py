# rainfall.py

def rainFall_1(inFileName):
    '''Compute total rainfall'''
    totalRain = 0
    inFile = open(inFileName, 'r')

    # Read in the data one line at a time
    for line in inFile:
        city, inches = line.split()
        print(f'{city} had {inches} inches of rain')
        totalRain += float(inches)

    inFile.close()

    print(f'Total inches of rain is {totalRain}')

# ----------------------------------------------------------------------------


def rainFall_2(inFileName):
    '''Same as function 1, but output is formatted'''
    # Display results in two formatted columns
    # Requires that we know the longest city name
    # So we need to read in the entire file before we start printing

    totalRain = 0
    longestCityLen = 0
    data = []

    inFile = open(inFileName, 'r')

    # read all data into a list and then close the input file
    for line in inFile:
        city, inches = line.split()
        inches = float(inches)

        if len(city) > longestCityLen:
            longestCityLen = len(city)

        totalRain += inches

        data.append((city, inches))

    inFile.close()

    # Display results
    for city, inches in data:
        print(f'{city:{longestCityLen}} had {inches:4.3f} inches of rain')

    print(f'total rain: {totalRain:4.3f}')


def maxRainFall(inFileName):
    '''Which city had the most rain'''
    maxRain = -1  # Assumes all rainfall values are non-negative

    inFile = open(inFileName, 'r')

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
    '''
    Read a txt file, save it as a CSV file. Use the same name as the input
    file, only change the extension from "txt" to "csv". Assumes the file name
    has just one "dot" which appears as : ".txt"
    '''

    # Construct the name of the output file
    name, extension = inFileName.split('.')
    outFileName = name + '.csv'

    # Open the files
    inFile = open(inFileName, 'r')
    outFile = open(outFileName, 'w')

    for line in inFile:
        city, inches = line.split()
        print(f'{city},{inches}', file=outFile)

    inFile.close()
    outFile.close()


def main():
    inFileName = 'rainfall.txt'

    rainFall_1(inFileName)
    # rainFall_2(inFileName)
    # maxRainFall(inFileName)

    # outFileName = 'rainFallCM.txt'
    # rain_inches_to_cm(inFileName, outFileName)

    # makeCSV(inFileName)


main()
