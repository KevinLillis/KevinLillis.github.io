def factorial(n):
    # check for base case
    if n <= 0:
        return 1
    
    return n * factorial(n-1)

def main():
    num = 120
    fact = factorial(num)
    print(f'{num}! = {fact}')
    
main()

