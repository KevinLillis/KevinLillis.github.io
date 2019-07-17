def infiniteLoop1():
    while 3 < 7:
        print('Hello')
#infiniteLoop1()

def infiniteLoop2():
    '''Some programmers like to use while True. I think that is a mistake'''
    n = 1
    while True:
        print(f'{n}) Hello')
        n += 1
#infiniteLoop2()

def infiniteLoop3():
    n = 1
    while n != 10:
        print(n)
        n += 2

infiniteLoop3()