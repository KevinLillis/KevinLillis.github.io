# input-validation-with-while.py

def inputNumber(low, high):
    prompt = f'Enter a number from {low} to {high}: '
    num = int(input(prompt))

    while not low <= num <= high:
        print('Invalid Entry')
        num = int(input(prompt))

    return num


def main():
    value = inputNumber(4, 12)
    print(value)


main()
