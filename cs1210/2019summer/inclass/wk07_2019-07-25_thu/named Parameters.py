def myFun(x=1, y=2, z=3):
    print(f'x={x}, y={y} z={z}')
  
print('Use all default values')  
myFun()

print()
print('provide specific values')
myFun('A')
myFun('A', 'B')
myFun('A', 'B', 'C')

print()
print('provide values by naming the argument')
myFun(x='W')
myFun(y='W')
myFun(z='W')

print()
print('can provide named arguments in any order')
myFun(z='S', x='Q', y='R')