# infiniteLoops.py

def infiniteLoop1():
    x = 1
    while 3 < 7:
        print(f'{x} - Hello')
        x += 1
        
def infiniteLoop2():
    x = 1
    while True:
        print(f'{x} - Hello')
        x += 1

def infiniteLoop3():
    x = 1
    while x != 10:
        print(x)
        x += 2
    
def main():
    #infiniteLoop1()
    #infiniteLoop2()
    infiniteLoop3()
    
main()