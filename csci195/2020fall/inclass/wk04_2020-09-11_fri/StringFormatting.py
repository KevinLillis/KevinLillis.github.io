# StringFormatting.py

##########################################################
# Example 1
# Use field widths
print('='*20)
print('Example 1')
first, last = 'Mike', 'Smith'
age = 26
message = f'{first:8} {last:3} is {age:10} years old.'
print(message)
'''Mike     Smith is         26 years old.'''
# Strings, left justified
# Numbers, right justified

##########################################################
# Example 2
# Add justification to field widths
print('='*20)
print('Example 2')
first, last = 'Mike', 'Smith'
age = 26
message = f'{first:>8} {last:^12} is {age:<10} years old.'
print(message)
'''    Mike    Smith     is 26         years old.'''
# Mike    right justified
# Smith   centered
# 26      left justified


##########################################################
# Example 3
# Add commas to number
print('='*20)
print('Example 3')
largeInt = 1234567890123456789
largeFloat = 123456789.123456789
message = f'{largeInt:,}\n{largeFloat:,}'
print(message)
'''
1,234,567,890,123,456,789
123,456,789.12345679
'''

##########################################################
# Floating Point Numbers

##########################################################
# Example 4
# field width not specifdied,  2 decimal places
print('='*20)
print('Example 4')
n = 88.88888
s = f'X{n:.2f}X'
print(s)
'''
X88.89X
'''
# Rounds

##########################################################
# Example 5
# field width of 7 and 2 decimal places
print('='*20)
print('Example 5')
n = 11.11111
s = f'X{n:7.2f}X'
print(s)
'''
X  11.11X
'''
