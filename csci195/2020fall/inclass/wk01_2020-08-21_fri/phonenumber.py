# phonenumber.py

def main():
    phoneNumber = 5633336429
    
    print(f'Phone nunber: {phoneNumber}')
    
    print('========================')
    
    areaCode = phoneNumber // (10 ** 7)
    print(f'Area Code: {areaCode}')
    
    phoneNumber = phoneNumber % (10 ** 7)
    print(f'Phone nunber: {phoneNumber}')

    print('========================')
    exchange = phoneNumber // (10 ** 4)
    print(f'Exchange: {exchange}')
    
    phoneNumber = phoneNumber % (10 ** 4)
    print(f'Phone nunber: {phoneNumber}')
    
    print('========================')
    line = phoneNumber
    print(f'Line Number: {line}')

    print('========================')
    print(f'Phone number is: ({areaCode}) {exchange}-{line}')
    
main()