def fibRec(n):
    # check for base case
    if n <= 1:
        return n
    
    return fibRec(n-1) + fibRec(n-2)

def main():
    for n in range(0, 10):
        print(f'fib({n}) = {fibRec(n)}')
    
main()