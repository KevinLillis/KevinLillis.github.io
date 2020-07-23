# lyrics.py

'''
Other ways to read from a text file
'''


def read1(inFileName):
    ''' read() Reads entire file into a single string'''
    lyricsfile = open(inFileName, 'r')
    data = lyricsfile.read()
    lyricsfile.close()

    print('-' * 50)
    print(data)

    data = data.split('\n')  # removes each \n

    print('-' * 50)
    for line in data:
        print(line)


def read2(inFileName):
    ''' read(n)  Returns a string consisting of the next n characters'''
    lyricsfile = open(inFileName, 'r')

    data = lyricsfile.read(10)
    print('1:', data, sep='')

    data = lyricsfile.read(15)
    print('2:', data, sep='')

    data = lyricsfile.read(10)
    print('3:', data, sep='')

    data = lyricsfile.read(5)
    print('4:', data, sep='')

    data = lyricsfile.read(13000)
    print('5:', data, sep='')

    lyricsfile.close()


def read3(inFileName):
    ''' readline()  Returns the next line, including the \n'''
    lyricsfile = open(inFileName, 'r')

    data = lyricsfile.readline()
    print('1:', data, sep='')
    print('---------------------------------')

    data = lyricsfile.read(10)
    print('2:', data, sep='')
    print('---------------------------------')

    data = lyricsfile.readline()
    print('3:', data, sep='')
    print('---------------------------------')

    data = lyricsfile.readline().rstrip()
    print('4:', data, sep='')
    print('---------------------------------')

    data = lyricsfile.readline().rstrip()
    print('5:', data, sep='')
    print('---------------------------------')

    lyricsfile.close()


def read4(inFileName):
    ''' readline(n)  Reads n characters, or up to the end of the line,
                     whichever is shorter.'''

    lyricsfile = open(inFileName, 'r')

    data = lyricsfile.readline(11)
    print('1:', data, sep='')

    data = lyricsfile.readline(11)
    print('2:', data, sep='')

    data = lyricsfile.readline(11)
    print('3:', data, sep='')

    data = lyricsfile.readline(11)
    print('4:', data, sep='')

    data = lyricsfile.readline(11)
    print('5:', data, sep='')

    lyricsfile.close()


def read5(inFileName):
    ''' readlines()  Returns a list of strings, one per line, keeps \n'''

    lyricsfile = open(inFileName, 'r')
    lines = lyricsfile.readlines()
    for line in lines:
        print(line)

    print('-----------------------------------')
    # Remove \n from the end of each list element
    lines = map(str.rstrip, lines)

    for line in lines:
        print(line)

    lyricsfile.close()


def main():
    lyricsData = 'One Eyed Cat.txt'

    #read1(lyricsData)  # read()
    #read2(lyricsData)  # read(n)
    #read3(lyricsData)  # readline()
    read4(lyricsData)  # readline(n)
    #read5(lyricsData)  # readlines


main()
