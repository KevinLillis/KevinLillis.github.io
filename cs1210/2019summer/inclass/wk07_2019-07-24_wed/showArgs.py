import sys
print(f'sys.argv has type {type(sys.argv)}')

print()
print(f'There are {len(sys.argv)} arguments.')
print('they are:')
for argument in sys.argv:
    print(f'   {argument} of type {type(argument)}')