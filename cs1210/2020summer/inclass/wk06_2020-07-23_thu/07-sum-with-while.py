# sum-with-while.py

def sumWithWile(n):
    total = 0
    num = 1
    while num <= n:
        total += num
        num += 1

    return total


def main():
    num = int(input('Enter a positive number: '))
    print(f'Sum from 1 to {num} = {sumWithWile(num)}')


main()
