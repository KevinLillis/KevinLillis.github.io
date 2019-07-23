def hanoi(n, source, dest, aux):
    # check for the base case
    if n == 1:
        print(f'Move disk form {source} to {dest}')
        return
    
    hanoi(n - 1, source, aux, dest)
    hanoi(1, source, dest, aux)
    hanoi(n - 1, aux, dest, source)
    
def main():
    n = 5
    source, dest, aux = 'A', 'C', 'B'
    hanoi(n, source, dest, aux)
    
main()