def palindrome(S):
    # Check for base case
    if len(S) <= 1:
        return True
    
    return S[0] == S[-1] and palindrome(S[1:-1])

def main():
    message = 'abcba'
    if palindrome(message):
        print(f'{message} is a palindrome')
    else:
        print(f'{message} is NOT a palindrome')
        
main()
            