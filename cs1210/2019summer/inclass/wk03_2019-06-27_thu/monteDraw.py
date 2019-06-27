import turtle
import random

def main():
    # Get user input. The number of darts to throw
    numThrows = int(turtle.textinput('Monte Carlo', 'How many throws'))
    
    # Create the turtle
    tur = getTurtle(numThrows)
    
    # Draw the background
    drawBackground(tur)
    
    # Perform the simulation with animationtion
    myPi = throwDarts(tur, numThrows)
    
    # Write the approximation of pi
    writeMessage(tur, numThrows, myPi)
    
    # End of program housekeeping (close the turtle out)
    turtle.done()
    
def getTurtle(numThrows):
    '''Set up the turtle environment, create a turtle, and then return it.'''
    
    # Set up the turtle
    # (LLx, LLy) & (URx, URy)
    turtle.setworldcoordinates(-2, -2, 2, 2)
    turtle.setup() # use these new coordinates
    
    tur = turtle.Turtle()
    wn = tur.getscreen()
    wn.title('Monte Carlo Simulation to Approximate Pi')
    
    # Speed up the animation
    tur.hideturtle() # Don't want to see the turtle darting around
    
    # Limit the number of screen updates
    # draw only every 10th update, but never fewer than 10
    tr = max(10, numThrows / 10)
    wn.tracer(tr)
    
    return tur

def drawBackground(tur):
    # Draw the coordinate
    tur.up()
    tur.goto(0, 1.3)
    tur.down()
    tur.goto(0, -1.3)
    tur.up()
    tur.goto(-1.3, 0)
    tur.down()
    tur.goto(1.3, 0)
    tur.up()
    
    # Draw the bounding square
    tur.up()
    tur.pensize(3) # make these lines a little thicker
    tur.goto(-1, 1)
    tur.down()
    for i in range(4):
        tur.forward(2)
        tur.right(90)
    tur.up()
    
    # Draw the circle
    tur.up()
    tur.goto(0, -1)
    tur.down()
    tur.circle(1, 360, 50) # radius=1, 360 degrees, 50 sides
    tur.up()
    
def throwDarts(tur, numThrows):
    '''Throw darts, draw the animation, return pi approximation'''
    tur.up()
    tur.speed(0) # fastest
    
    # This is where the simulation actually starts
    numInCircle = 0
    for i in range(numThrows):
        # generate (x, y) and move the turtle there
        x = random.uniform(-1, 1)
        y = random.uniform(-1, 1)
        tur.goto(x, y)
        
        # See if this dart landed inside the circle
        if x*x + y*y <= 1:
            # Dart is in the circle. Count it and make turtle blue
            numInCircle += 1
            tur.color('blue')
        else:
            # Dart is NOT in the circle. Just make turtle red
            tur.color('red')
        
        # Draw the dot. Turtle will be either red or blue depending on the 
        # above if-else statment. Dot can be used even when turtle is up.
        tur.dot()
        
    piApprox = 4 * (numInCircle / numThrows)
    return piApprox

def writeMessage(tur, numThrows, piApprox):
    tur.color('black')
    tur.goto(0, -1.5)
    
    message = f'n = {numThrows}'
    message += f' Approximation for pi = {piApprox:.4f}.'
    
    tur.write(message, False, 'center', ('Arial', 16, 'bold'))
    
main()