import os

def getSize1(fileSpec):
    # check base case. Is this a file?
    if os.path.isfile(fileSpec):
        return os.path.getsize(fileSpec)

    # path is not a file, it is a directory.
    # Do a recursive call for each name in the directory
    total = 0
    for name in os.listdir(fileSpec):
        size = getSize1(f'{fileSpec}/{name}')
        total += size

    return total

def getSize2(fileSpec):
    '''Print the size of each file found'''
    # check base case. Is this a file?
    if os.path.isfile(fileSpec):
        size = os.path.getsize(fileSpec)
        print(f'{os.path.abspath(fileSpec)} : {size} bytes')
        return size

    # path is not a file, it is a directory.
    # Do a recursive call for each name in the directory
    total = 0
    for name in os.listdir(fileSpec):
        size = getSize2(f'{fileSpec}/{name}')
        total += size

    return total

def main():
    fileSpec = '/kevin'
    size = getSize1(fileSpec)
    # size = getSize2(fileSpec)

    print(f'{os.path.abspath(fileSpec)} has {size} bytes')

main()