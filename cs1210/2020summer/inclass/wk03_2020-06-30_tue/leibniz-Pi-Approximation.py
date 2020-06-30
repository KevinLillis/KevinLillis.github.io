# leibniz-Pi-Approximation.py

def leibniz1(numTerms):
    acc = 0

    # values for first term
    numerator = 4
    denominator = 1
    sign = 1

    for i in range(numTerms):
        term = sign * (numerator / denominator)
        acc += term

        # get ready for the next term
        # numerator doesn't change
        denominator += 2
        sign = -sign

    return acc


def leibniz2(numTerms):
    acc = 0
    for i in range(numTerms):
        term = (4 * (-1) ** i) / (2 * i + 1)
        acc += term

    return acc


def main():
    print(f'Leibniz approximation of pi is {leibniz1(10000)}')
    print(f'Leibniz approximation of pi is {leibniz1(10000)}')


main()
