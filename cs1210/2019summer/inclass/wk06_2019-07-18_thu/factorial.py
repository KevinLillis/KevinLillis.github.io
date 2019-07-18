def factorial(n):
    # Check for base case
    if n <= 1:
        return 1 # this handles 0, 1, and all negative numbers
    
    return n * factorial(n-1)

def main():
    num = 12
    fact = factorial(num)
    print(f'{num}! = {fact}')
    
main()