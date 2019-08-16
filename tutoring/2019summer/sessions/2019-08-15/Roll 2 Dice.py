import random

numRolls = 10000

counts = ['X','X',0,0,0,0,0,0,0,0,0,0,0]

for i in range(numRolls):
    die1 = random.randint(1, 6)
    die2 = random.randint(1, 6)
    totalRoll = die1 + die2
    counts[totalRoll] = counts[totalRoll] + 1
    
for i in range(2, 13):
    print(f'The value {i} was rolled {counts[i]} times, that is {counts[i] / numRolls * 100}%.')
    
