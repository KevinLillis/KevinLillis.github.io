# Palindrome - Determine if a string is a palindrome.
# Only considered letters a-z and A-Z.
# Tests are case insensitive.


def pal_1(s):
    '''Makes a new copy of the string each time'''
    # Check for base case
    if len(s) <= 1:
        return True
    
    if not s[0].isalpha():
        return pal_1(s[1:])
    
    if not s[-1].isalpha():
        return pal_1(s[:-1])
    
    if s[0].lower() != s[-1].lower():
        return False
    
    return pal_1(s[1:-1])
    
def pal_2(s):
    '''
    Uses starting and ending indexes.
    So a copy isn't made each time.
    '''
    return pal_2_helper(s, 0, len(s) - 1)
    
def pal_2_helper(s, start, end):
    '''This is the actual recursive function'''
    
    # check for base case:
    if end <= start:
        return True
    
    if not s[start].isalpha():
        return pal_2_helper(s, start + 1, end)
    
    if not s[end].isalpha():
        return pal_2_helper(s, start, end - 1)
    
    if s[start].lower() != s[end].lower():
        return False
    
    return pal_2_helper(s, start + 1, end - 1)
    

def runTests(pal):
    palindromes = ['', 'a', 'aa', 'aba', 'abba']
    palindromes += ['A Man, A Plan, A Canal-Panama!', 'Mr. Owl Ate My Metal Worm.']
    palindromes += ['Was It A Rat I Saw?']
    palindromes += ['--++}[.>a$#B`c$#~@bA   $']

    non_palindromes = ['ab', 'abb', 'abcd']
    non_palindromes += ['Des Monies, Iowa']
    
    print('Palindromes')
    for message in palindromes:
        print(f'    {"Passed" if pal(message) else "Failed"} : {message}')

    print()
    print('Not Palindromes')
    for message in non_palindromes:
        print(f'    {"Passed" if not pal(message) else "Failed"} : {message}')


def main():
    #runTests(pal_1)
    runTests(pal_2)

main()

