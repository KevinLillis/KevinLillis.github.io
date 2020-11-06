# guessing-game.py

import random

def main():
    n = random.randint(1, 10)
    print(f'CHEAT ==> The number is {n}')
    
    guess = int(input('Guess a number from 1 to 10: '))
    
    finished = guess == n
    
    while not finished:
        if guess < n:
            prompt = 'Too low. Guess again: '
        else:
            prompt = 'Too high. Guess again: '
            
        guess = int(input(prompt))
        finished = guess == n
    
    print('Congrats! You got it')
    
main()