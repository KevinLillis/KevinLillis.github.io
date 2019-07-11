# Ways things can be added to namespace:
#    - assignment
#    - import
#    - def function
#    
# dir() returns a list of items in current namespace
#
# globals() returns a dictionary

x = 2

def f1():
    x = 5 # x is local to f1
    print(f'f1 x = {x}') # prints 5
    print(f'f1 dir():  {dir()}') # ['x']
    
def f2():
    x = 12 # x is loxal to f2()
    print(f'f2 x = {x}')
    f1()
    print(f'f2 x = {x}')
    print(f'f2 dir(): {dir()}') # ['x']
  
def f3():
    # need global because x = 200 would
    # create new entry in local namespace
    
    global x # no local x, using global x
    print(f'f3 x = {x}') # prints 2
    x = 200
    print('f3 dir():', dir()) # []
    
def f4():
    # using global x
    # don't need "global" because not adding x to local namespace
    # i.e. no assignment here
    print(f'f4 x = {x}') # prints 200
   
def f5():
    # Can access the global variable even when there is a local variable
    # with the same name, but it's not easy.
    
    x = 10 # local variable x

    print(f'f5: local x = {x}')
    print(f"f5: global x = {globals()['x']}")
    
    x = 55
    globals()['x'] = 12
    
    print(f'f5: local x = {x}')
    print(f"f5: global x = {globals()['x']}")
    
def f6():
    # Create a new global variable from within a function
    global y
    y = 123
    
print(f'gl x = {x}')  
f4()
f3()
f4()
f2()
print(f'gl x = {x}')  
f5()
print(f'After f5(), global x = {x}')
f6()
print(f'After f6(), global y = {y}')
