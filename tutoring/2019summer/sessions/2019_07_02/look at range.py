# A program to sum the numbers from 1 to n
# using the range() function

n = 15

# Here, range will have all numbers from 0 to n-1
# We take that range and turn it into a list called L
L = list(range(n))

# Print the list so we can see what numbers the range gave.
print(L)

# Print the numbers from the range without first putting
# them into a list.
for num in range(n):
    print("number", num)

# We can start the range at a nunber other than 0.
# Here we start it at 1
L = list(range(1, n))
print(L)
    
# Now we finally have the numbers from 1 to n
L = list(range(1, n+1))
print(L)

# Let's add them up, saving the running total
total = 0
for num in range(1, n+1):
    total = total + num
    
# Finally, print the answer
print(total)

#############################
# Let's add some interaction with the person running
# the program, the "User"
n = int(input("Enter a number: "))
total = 0
for num in range(1, n+1):
    total = total + num
    
print('Sum from 1 to', n, 'equals', total)