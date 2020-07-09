# Two functions to count lowercase charactgers in a string
def countLower1(s):
    numLower = 0

    for ch in s:
        if ch.islower():
            numLower += 1

    return numLower


def countLower2(s):
    numLower = 0

    for ch in s:
        if ch in 'abcdefghijklmnopqrstuvwxyz':
            numLower += 1

    return numLower

def main():
    # message = input('Enter a message: ')
    message = 'Abc123'
    print(f'There are {countLower1(message)} lowercase letters.')
    print(f'There are {countLower2(message)} lowercase letters.')


main()
