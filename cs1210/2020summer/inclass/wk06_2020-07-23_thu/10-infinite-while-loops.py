# infinite-while-loops.py

def infiniteLoop1():
    while 3 < 7:
        print('Hello')


def infiniteLoop2():
    '''Some programmers like to use while True. I think that is a mistake'''
    n = 1
    while True:
        print(f'{n:,}) Hello')
        n += 1


def infiniteLoop3():
    n = 1
    while n != 10:
        print(n)
        n += 2


def main():
    # infiniteLoop1()
    # infiniteLoop2()
    infiniteLoop3()


main()
