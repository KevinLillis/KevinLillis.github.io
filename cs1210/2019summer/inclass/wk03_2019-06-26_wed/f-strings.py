# f-strings.py
import math
import random

# Example 1
# No real formatting
print('*' * 20)
print('Example 1')
name = 'Mike'
age = 26

print(name, 'is', age, 'years old')

message = name + ' is ' + str(age) + ' years old'
print(message)

message = f'{name} is {age} years old'
print(message)

# Example 2
# Add field widths
print('*' * 20)
print('Example 2')
name = 'Rebekah'
age = 31
message = f'{name:15s} is {age:10d} years old.'
print(message)

# Example 3
# Add field widths
print('*' * 20)
print('Example 3')
name = 'Rebekah'
age = 31
message = f'{name:^15s} is {age:<10d} years old.'
print(message)
message = f'{name:>15s} is {age:<10d} years old.'
print(message)

# Example 4
# Construct the formatting dynamicaly, using variables
print('*' * 20)
print('Example 4')
for places in range(1, 10):
    message = f'pi to {places:2d} places is {math.pi:{places/10}f}'
    print(message)
    
# Example 5
# Add commas to our numbers
print('*' * 20)
print('Example 5')
largeInt = 12345678901234567890
largeFloat = 1234567890123.1234567890123456

message = f'{largeInt:,d}\n{largeFloat:,.9f}'
print(message)

# Example 6
# Force plus and minus signs
print('*' * 20)
print('Example 6')
for n in range(-10, 11, 2):
    print(f'n = {n:+2d}')
    
# Example 7
# Right justify Force plus and minus signs
print('*' * 20)
print('Example 6')
for n in range(-1000, 1001, 400):
    print(f'n = {n:>+12}')    
    
# Example 7
# Right justify Force plus and minus signs, use different fill character
print('*' * 20)
print('Example 6')
for n in range(-1000, 1001, 400):
    print(f'n = {n:.>+12}')    