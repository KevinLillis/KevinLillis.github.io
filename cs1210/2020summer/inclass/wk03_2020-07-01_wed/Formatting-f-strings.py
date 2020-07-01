# Formatting-f-strings.py

################################################################
# Example 1
# Use field widths
print('===============================================')
print('Example 1')
first, last = 'Mike', 'Smith'
age = 26
message = f'{first:8} {last:3} is {age:10} years old'
print(message)


################################################################
# Example 2
# Add justification to the field widths
print('===============================================')
print('Example 2')
first, last = 'Mike', 'Smith'
age = 26
message = f'{first:>8} {last:^12} is {age:<10} years old'
print(message)


################################################################
# Example 3
# Add commas to numbers
print('===============================================')
print('Example 3')
largeInt = 1234567890123456789901123456
largeFloat = 123456789.123456789
message = f'{largeInt:,}\n{largeFloat:,}'
print(message)


################################################################
# Formatting Floating Point Numbers

################################################################
# Example 4
# Field width not specified, 2 decimal places
print('===============================================')
print('Example 4')
n = 88.88888
message = f'X{n:0.2f}X'
print(message)


################################################################
# Example 5
# Field width of 7, 2 decimal places
print('===============================================')
print('Example 5')
n = 88.88888
message = f'X{n:7.2f}X'
print(message)
