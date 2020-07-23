# guessing-game.py

import random


def main():
    n = random.randint(1, 10)
    print(f'===> CHEAT: the number is {n}')

    guess = int(input('Guess a number from 1 to 10: '))
    done = guess == n

    while not done:
        if guess < n:
            prompt = 'Too low. Guess again: '
        else:
            prompt = 'Too high. Guess again: '

        guess = int(input(prompt))
        done = guess == n

    print('Congratulations! You got it!')


main()
