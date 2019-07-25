import Clock1
import Clock2
clockModule = Clock2

errorCount = 0

# Test Constructors
c1 = clockModule.Clock()
if c1.getTime() != (0,0,0):
    print('Error in constructor test 1')
    errorCount += 1

c2 = clockModule.Clock(10)
if c2.getTime() != (10,0,0):
    print('Error in constructor test 2')
    errorCount += 1
    
c3 = clockModule.Clock(10,15)
if c3.getTime() != (10,15,0):
    print('Error in constructor test 3')
    errorCount += 1
    
c4 = clockModule.Clock(10,15,35)
if c4.getTime() != (10,15,35):
    print('Error in constructor test 4')
    errorCount += 1
    
c5 = clockModule.Clock(minute=22,hour=14,second=44)
if c5.getTime() != (14,22,44):
    print('Error in constructor test 5')
    errorCount += 1

# Test Mutators
c6 = clockModule.Clock()
if c6.getTime() != (0,0,0):
    print('Error in mutator test 1')
    errorCount += 1

c6.setHour(10)
if c6.getTime() != (10,0,0):
    print('Error in mutator test 2')
    errorCount += 1

c6.setMinute(15)
if c6.getTime() != (10,15,0):
    print('Error in mutator test 3')
    errorCount += 1

c6.setSecond(35)
if c6.getTime() != (10,15,35):
    print('Error in mutator test 4')
    errorCount += 1
    
c7 = clockModule.Clock()
if c7.getTime() != (0,0,0):
    print('Error in mutator test 1')
    errorCount += 1

c7.setTime(13)
if c7.getTime() != (13,0,0):
    print('Error in mutator test 2')
    errorCount += 1
    
c7.setTime(23,24)
if c7.getTime() != (23,24,0):
    print('Error in mutator test 3')
    errorCount += 1
    

c7.setTime(33,34,35)
if c7.getTime() != (33,34,35):
    print('Error in mutator test 4')
    errorCount += 1
    

# Using named parameters
c7.setTime(hour=9)
if c7.getTime() != (9,34,35):
    print('Error in mutator test 5')
    errorCount += 1
    

c7.setTime(minute=10)
if c7.getTime() != (9,10,35):
    print('Error in mutator test 6')
    errorCount += 1
    
c7.setTime(second=11)
if c7.getTime() != (9,10,11):
    print('Error in mutator test 7')
    errorCount += 1
    

# With no parameters, the time is not changed.
c7.setTime()
if c7.getTime() != (9,10,11):
    print('Error in mutator test 8')
    errorCount += 1
    
# Reset
c7.reset()
if c7.getTime() != (0,0,0):
    print('Error in mutator test 9')
    errorCount += 1
    

#Test Accessors
c8 = clockModule.Clock(11,12,13)
if c8.getTime() != (11,12,13):
    print('Error in accessor test 1')
    errorCount += 1
    
if c8.getHour() != 11:
    print('Error in accessor test 2')
    errorCount += 1
    
if c8.getMinute() != 12:
    print('Error in accessor test 3')
    errorCount += 1
    
if c8.getSecond() != 13:
    print('Error in accessor test 4')
    errorCount += 1
    

if c8.getTime() != (11,12,13):
    print('Error in accessor test 5')
    errorCount += 1


# Test str()
c9 = clockModule.Clock(1,23,59)
if str(c9) != '01:23:59':
    print('Error in str() test 1')
    errorCount += 1
    
if errorCount == 0:
    print('No Errors Found')

