n = 11.11111

# field width of 7 and 2 decimal places
s = f'X{n:7.2f}X'
print('Number 1')
print(s)
print()


# field width not specifdied and 2 decimal places
s = f'X{n:.2f}X'
print('Number 2')
print(s)
print()


# Use a variable for the field width
width = 9
s = f'X{n:{width}.2f}X'
print('Number 3')
print(s)
print()


# Use variables for both the width and the number of decimal places
width = 9
places = 3
s = f'X{n:{width}.{places}f}X'
print('Number 4')
print(s)
print()
