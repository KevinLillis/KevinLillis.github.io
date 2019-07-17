def sumWithWile(n):
    total = 0
    while n > 0:
        total += n
        n -= 1
        
    return total

def main():
    num = int(input('Enter a positive number: '))
    print(f'Sum from 1 to {num} = {sumWithWile(num)}')
    
main()
