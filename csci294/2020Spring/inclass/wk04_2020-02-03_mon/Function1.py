# Function1.py

def funA(counter):
    if counter > 0:
        print('FunA', counter)
        funB(counter - 1)    
        
def funB(counter):
    if counter > 0:
        print('FunB', counter)
        funA(counter - 1)

def main():
    funA(5)

main()