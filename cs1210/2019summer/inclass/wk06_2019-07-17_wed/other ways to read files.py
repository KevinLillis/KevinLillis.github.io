def read1():
    ''' read() - Read the entire file into a single string'''
    lyricsFile = open('The Calculation.txt', 'r')
    data = lyricsFile.read()
    lyricsFile.close()
    
    print(data)
#read1()

def read2():
    '''read(n) - REturns a string of n characters'''
    lyricsFile = open('The Calculation.txt', 'r')
    
    data = lyricsFile.read(10)
    print(f'1) {data}')
    
    data = lyricsFile.read(10)
    print(f'2) {data}')
    
    data = lyricsFile.read(10)
    print(f'3) {data}')
    
    data = lyricsFile.read(10)
    print(f'4) {data}')
    
    data = lyricsFile.read(10)
    print(f'5) {data}')   
    
    lyricsFile.close()
#read2()

def read3():
    '''readline() - returns the next line, including the \n'''
    lyricsFile = open('The Calculation.txt', 'r')

    data = lyricsFile.readline()
    print(f'1) {data}')   

    data = lyricsFile.readline()
    print(f'2) {data}')   
    
    data = lyricsFile.readline()
    print(f'3) {data}')   
    
    data = lyricsFile.readline()
    print(f'4) {data}')   
    
    data = lyricsFile.readline()
    print(f'5) {data}') 
    
    lyricsFile.close()
#read3()
 
def read4():
    '''readline(n) - reads n characters, or up to the end of the line'''
    lyricsFile = open('The Calculation.txt', 'r')

    data = lyricsFile.readline(10)
    print(f'1) {data}')   

    data = lyricsFile.readline(10)
    print(f'2) {data}')   
    
    data = lyricsFile.readline(10)
    print(f'3) {data}')   
    
    data = lyricsFile.readline(10)
    print(f'4) {data}')   
    
    data = lyricsFile.readline(10)
    print(f'5) {data}') 
    
    lyricsFile.close()
#read4()

def read5():
    ''' readlines() - returns a list of strings, one per line, keeps \n'''
    lyricsFile = open('The Calculation.txt', 'r')
    
    lines = lyricsFile.readlines()
    lyricsFile.close()
    
    for line in lines:
        print(line)
        
    # strip teh new line character from the end of each string
    
    lines = map(str.strip, lines)
    for line in lines:
        print(line)
    
read5()