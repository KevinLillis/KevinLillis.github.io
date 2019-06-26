# if-examples.py

import random

def example1():
    score = int(input('enter your score: '))
    passingGrade = 60

    message = 'You passed'
    
    if score < passingGrade:
        message = 'You failed'
        
    print(message)
    
def example2():
    score = int(input('enter your score: '))
    passingGrade = 60

    if score >= passingGrade:
        message = 'You passed'
    else:
        message = 'You failed'
        
    print(message)  
    
def example3():
    temp = int(input('enter temperature: '))
    
    if temp <= 32:
        state = 'solid'
        
    else:
        if temp < 212:
            state = 'liquid'
        else:
            state = 'gas'
            
    print('at',temp,'degrees F H20 is a', state)
    

def example4():
    temp = int(input('enter temperature: '))
    
    if temp <= 32:
        state = 'solid'   
    elif temp < 212:
        state = 'liquid'
    else:
        state = 'gas'
            
    print('at',temp,'degrees F H20 is a', state)
    
def getGrade(score):
    if score < 60:
        grade = 'F'
    elif score < 70:
        grade = 'D'
    elif score < 80:
        grade = 'C'
    elif score < 90:
        grade = 'B'
    else:
        grade = 'A'
        
    return grade
    
def example5():
    # Count negative, positive, and zero
    negCount = 0
    posCount = 0
    zeroCount = 0
    
    for i in range(2000):
        x = random.randint(-100, 100)
        if x < 0:
            negCount += 1
        elif x == 0:
            zeroCount += 1
        else:
            posCount += 1
            
    print(f'{"neg:":5}{negCount:>6}')
    print(f'{"zero:":5}{zeroCount:>6}')
    print(f'{"pos:":5}{posCount:>6}')

def main():
    #example1()
    #example2()
    #example3()
    #example4()
    
    # Test the getGrade fuction
    #result = int(input('Enter your score: '))
    #print('your grade is', getGrade(result))
    
    example5()
main()
    
