def fun1(*argv):
    # argv is a tuple
    for argument in argv:
        print(argument)
        
def fun2(arg1, *argv):
    print(f'first argument is {arg1}')
    
    print('the rest are:')
    for argument in argv:
        print(argument)
        
    