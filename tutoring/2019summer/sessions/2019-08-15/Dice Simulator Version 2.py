import random

numRolls = 10000

counts = ['X',0,0,0,0,0,0]

for i in range(numRolls):
    die = random.randint(1, 6)
    counts[die] = counts[die] + 1
    
for i in range(1, 7):
    print(f'The value {i} was rolled {counts[i]} times, that is {counts[i] / numRolls * 100}%.')
    
