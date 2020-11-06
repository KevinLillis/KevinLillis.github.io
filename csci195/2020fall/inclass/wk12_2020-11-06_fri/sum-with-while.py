# sum-with-while.py

''' Sum the nubmbers from 1 to n using a while loop. '''

def sumWithWhile(n):
    total = 0
    num = 1
    while num <= n:
        total += num
        num += 1
    
    return total

def main():
    n = int(input('Enter a positive number: '))
    print(f'Sum from 1 to {n} is {sumWithWhile(n)}')
    
main()