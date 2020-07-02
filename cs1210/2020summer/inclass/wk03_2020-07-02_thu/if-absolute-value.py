# if-absolute-value.py

def main():
    num = int(input('Enter an integer: '))
    
    if num < 0:
        num = -num
        
    print(f'The absolute value of your number is {num}')
    
main()