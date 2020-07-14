# globalNamespace.py

'''
  Ways things can be added to namespace:
     - assignment
     - import
     - def function
     
  globals() returns a dictionary
  
  Global variabls will have 3-digit values
  Local variables will have single-digit values
'''  

def fun_A():
    print()
    print( '   ======= In fun_A =======')
    
    # Can see the global variable
    
    print(f'   x: {x}   This is the global variable')
    print()
    
def fun_B():
    print()
    print( '   ======= In fun_B =======')
    
    # Remember that the assignment statement creates a new variable.
    # So when we do the following, we get a new variable (in the local scope of
    # fun_B) with the same name as the global variable. That means this
    # local variable now *hides* the global variable.
    
    x = 2
    
    print(f'   x: {x}   This is local to fun_B')
    print()
    
def fun_C():
    print()
    print( '   ======= In fun_C =======')

    # To assign a new value to the global variable, need to use the global
    # keyword. Otherwise, we'll just create a local variable like in fun_B().
    # The global keyword tells Python NOT to create a new local variable when
    # assigning a value. Insted, Python will use the global namespace for the
    # variable name.
    
    global x
    x = 300

    print(f'   x: {x}   This is the global variable')
    print()
    
def fun_D():
    print()
    print( '   ======= In fun_D =======')

    # We can create a new global variable from within a function
    
    global y
    y = 400

    print(f'   y: {y}   This is a new global variable')
    print()

def fun_E():
    print()
    print( '   ======= In fun_E =======')

    # This function is interesting. It causes an error because x += 1 is the 
    # same as x = x + 1, which is an Assignment Statement. As we saw in 
    # fun_B, an assignment statement creates a new (local) variable called
    # x. So when Python tries to evaluate the right hand side (x + 1) the
    # variable x is refering to the Local variable. But the local variable
    # has not yet been assigned a value, thus the error.
    
    x += 1 # Create a local variable and try to assign a value to it

def fun_F():
    print()
    print( '   ======= In fun_F =======')
    
    # Can access a global variable even though there is a local variable
    # with the same name, which is hiding the global variable. This involves
    # calling the builtin globals() function, which returns a dictionary.
    
    x = 5 # a local variable
    globals()['x'] = 600 # The global variable
    
    print(f'   x: {x}   This is the local variable')
    print(f"   globals()['x']: {globals()['x']}   This is the global variable")
    print()
    
    
def fun_G():
    print()
    print( '   ======= In fun_G =======')
    
    # Can create a new global variable that has the same name as a local 
    # variable. 
    
    z = 7 # a local variable
    globals()['z'] = 800 # The global variable
    
    print(f'   z: {z}   local variable')
    print(f"   globals()['z']: {globals()['z']}   This is a new global variable")
    print()
    
x = 100 # This is a global variable

print(f'x before calling fun_A: {x}')
fun_A()
print(f'x after calling fun_A: {x}')
print('=' * 60)

print(f'x before calling fun_B: {x}')
fun_B()
print(f'x after calling fun_B: {x}')
print('=' * 60)

print(f'x before calling fun_C: {x}')
fun_C()
print(f'x after calling fun_C: {x}')
print('=' * 60)

print(f'x before calling fun_D: {x}')
fun_D()
print(f'x after calling fun_D: {x}')
print(f'y after calling fun_D: {y}')
print('=' * 60)

# fun_E causes an error that reads "local variable 'x' referenced before
# assignment". The details are in the comments of fun_E. Uncomment the 
# following line to see the error in action.

#fun_E()

print(f'x before calling fun_F: {x}')
print(f'y Before calling fun_F: {y}')
fun_F()
print(f'x after calling fun_F: {x}')
print(f'y after calling fun_F: {y}')
print('=' * 60)

print(f'x before calling fun_G: {x}')
print(f'y before calling fun_G: {y}')
fun_G()
print(f'x after calling fun_G: {x}')
print(f'y after calling fun_G: {y}')
print(f'z after calling fun_G: {z}')
print('=' * 60)
