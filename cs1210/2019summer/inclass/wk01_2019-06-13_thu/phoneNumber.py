# phoneNumber.py

def main():
    phoneNumber = 5633336429
    print('Phone Number:', phoneNumber)

    print('==============================')
    
    areaCode = phoneNumber // (10 ** 7)
    print('Area Code:', areaCode)
    
    phoneNumber = phoneNumber % (10 ** 7)
    print('Phone number is now', phoneNumber)
    
    print('==============================')
    
    prefix = phoneNumber // (10 ** 4)
    print('Prefix:', prefix)
    
    phoneNumber = phoneNumber % (10 ** 4)
    print('Phone Number is now:', phoneNumber)

    print('==============================')

    lineNumber = phoneNumber
    print('Line Number:', lineNumber)
    
    print('==============================')

    print('Phone Number is: ', '(', areaCode, ') ', prefix, '-', lineNumber, sep='')
    
main()
    