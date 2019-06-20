def fun1():
    x = 5
    print('fun1:', x)
    
def fun2():
    x = 33
    print('fun2:',x)
    fun1()
    print('fun2:',x)
    
print("Let's call some functions")
fun1()
fun2()