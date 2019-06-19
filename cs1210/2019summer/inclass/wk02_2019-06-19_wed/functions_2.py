def funA():
    print('In Function A')
    
def funB():
    funA()
    print('In Function B')
    funD()

def funC():
    print('In Function C')

def funD():
    print('In Function D')

def main():
    funA()
    funA()
    funD()
    print()
    funB()
    
main()