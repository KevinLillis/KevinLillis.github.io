# tail-nesting-grades.py

def main1():
    score = int(input('Enter score: '))
    
    if score >= 90:
        grade = 'A'
    else:
        if score >= 80:
            grade = 'B'
        else:
            if score >= 70:
                grade = 'C'
            else:
                if score >= 60:
                    grade = 'D'
                else:
                    grade = 'F'
    
    print(f'Your grade is {grade}')
    
#main1()

def main2():
    score = int(input('Enter score: '))
    
    if score >= 90:
        grade = 'A'
    elif score >= 80:
        grade = 'B'
    elif score >= 70:
        grade = 'C'
    elif score >= 60:
        grade = 'D'
    else:
        grade = 'F'
    print(f'Your grade is {grade}')

main2()