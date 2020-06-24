# passByValue.py

def changeParameter(x):
    '''
    Changing the parameter x in this function does not change the variable
    value in main()
    '''
    
    print(f'    before change x = {x}')
    x = x + x
    print(f'    after change x = {x}')

def main():
    value = 5
    print(f'in main value = {value}')
    changeParameter(value)
    print(f'in main value = {value}')

main()