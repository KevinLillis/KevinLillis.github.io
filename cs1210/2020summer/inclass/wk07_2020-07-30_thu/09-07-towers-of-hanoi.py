def move(fromPeg, toPeg):
    '''
    Actually move a disk from one peg to another.
    For our purposes, will just print "fromPeg --> toPeg".
    This could be a connection to a robotic arm.
    '''
    print(f'{fromPeg} --> {toPeg}')

def hanoi1(numDisks, start, end, aux):
    # Check for base case
    if numDisks == 1:
        move(start, end)

    else:
        hanoi1(numDisks - 1, start, aux, end)
        hanoi1(1, start, end, aux)
        hanoi1(numDisks-1, aux, end, start)

def hanoi2(numDisks, start, end, aux, moveCount):
    '''Print a sequential move number before doing the move'''

    # Check for base case
    if numDisks == 1:
        moveCount += 1
        print(f'Move {moveCount: 3}: ', end = '')
        move(start, end)

    else:
        moveCount = hanoi2(numDisks - 1, start, aux, end, moveCount)
        moveCount = hanoi2(1, start, end, aux, moveCount)
        moveCount = hanoi2(numDisks-1, aux, end, start, moveCount)

    return moveCount
    
def hanoiMain():
    disks = 3
    start, end, aux = '1', '3', '2'

    hanoi1(disks, start, end, aux)

    # count = 0
    # hanoi2(disks, start, end, aux, count)

hanoiMain()

