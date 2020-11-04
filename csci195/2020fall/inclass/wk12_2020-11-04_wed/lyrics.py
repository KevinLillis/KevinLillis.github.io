# lyrics.py

'''Other ways to read from a text file'''

def read1(inFileName):
    ''' read() Reads the entire file into a sigle string'''
    lyricsFile = open(inFileName, 'r')
    data = lyricsFile.read()
    lyricsFile.close()
    
    print('-' * 50)
    print(data)
    
    data = data.split('\n')
    print('-' * 50)
    print(data)

    print('-' * 50)
    print(f'there are {len(data)} lines')
    
    print('-' * 50)
    for line in data:
        print(line)
      
def read2(inFileName):
    lyricsFile = open(inFileName, 'r')
    
    data = lyricsFile.read(10)
    print(f'1) {data}')
    
    data = lyricsFile.read(13)
    print(f'2) {data}')

    data = lyricsFile.read(130000)
    print(f'3) {data}')

    lyricsFile.close()
    
def read3(inFileName):
    ''' readline() Reads the next line, including the \n'''
    lyricsFile = open(inFileName, 'r')
    data = lyricsFile.readline()
    print(f'1: {data}')
    
    data = lyricsFile.readline(5)
    print(f'2: {data}')
    
    data = lyricsFile.readline(50000)
    print(f'3: {data}')


def main():
    read3('wantedMan.txt')

main()