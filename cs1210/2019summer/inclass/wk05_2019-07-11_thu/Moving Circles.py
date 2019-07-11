import turtle
import random
import math

# Define global variables so they can be used by multiple functions
radius = 10

# Six parallel arrays
position_x = []
position_y = []
velocity_x = []
velocity_y = []
mainColor = []
activeColor = []

t = None # this is the turtle
numCircles = None

def drawCircle(x, y):
    ''' draw a circle centered at (x, y). Uses global variables radius & t'''
    t.up()
    t.goto(x - radius, y)
    t.setheading(0)
    t.down()
    t.begin_fill()
    t.circle(radius)
    t.end_fill()
    t.up

def initializeLists():
    '''Initialize the six global lists'''
    for i in range(numCircles):
        # Initialize all the lists for circle i
        
        # Random (x, y) position for circle i
        position_x.append(random.randint(-200, 200))
        position_y.append(random.randint(-200, 200))
        
        # Random velocity for circle i (there is no velocity of zero)
        velocity_x.append(random.choice([-3, -2, -1, 1, 2, 3])) # Larger magnitude is faster
        velocity_y.append(random.choice([-3, -2, -1, 1, 2, 3])) # Larger magnitude is faster
        
        # random color for each circle. color is (r,g,b), where r, g, and b are all in [0,1)
        r = random.random()
        g = random.random()
        b = random.random()
        mainColor.append([r,g,b]) # color when not touching. Never changes.
        activeColor.append([r,g,b]) # Colors actually drawn. Will change.

def circlesTouch(i, j):
    '''returns true iff circles i and j touch.'''
    x1, y1 = position_x[i], position_y[i]
    x2, y2 = position_x[j], position_y[j]
    
    dist = math.hypot(x2-x1, y2-y1)
    
    return dist < 2 * radius
    
def gameloop():
    # clear the canvas and hide the turtle
    t.clear()
    
    # Set the color for each circle
    # If the circles don't touch, use the main color. If they do touch, use red.
    # Assumes all colors have been set to the main color before calling this function
    for i in range(numCircles):
        for j in range(i+1, numCircles):
            # gives every i,j pair
            if circlesTouch(i,j):
                activeColor[i] = [1,0,0] # red
                activeColor[j] = [1,0,0] # red
    
    # Iterate through all circles
    for i in range(numCircles):
        
        # Set the color & fill-color for circle i
        # color is r,g,b each in [0,1)
        t.pencolor(activeColor[i][0], activeColor[i][1], activeColor[i][2])
        t.fillcolor(activeColor[i][0], activeColor[i][1], activeColor[i][2])
        
        # draw circle i
        drawCircle(position_x[i], position_y[i])
        
        # reset color of circle i for next iteration
        activeColor[i] = mainColor[i]
        
        # move circle i based on its velocity
        position_x[i] += velocity_x[i]
        position_y[i] += velocity_y[i]
        
        # Bouncing - check to see if the circle hit and edge and
        # react accordingly (nudge it back onto the screen and flip
        # its speed so it moves in the opposite direction)
        if position_x[i] > 200:
            position_x[i] = 199
            velocity_x[i] *= -1
            
        if position_x[i] < -200:             
            position_x[i] = -199
            velocity_x[i] *= -1 
            
        if position_y[i] > 200:
            position_y[i] = 199
            velocity_y[i] *= -1
            
        if position_y[i] < -200:
            position_y[i] = -199
            velocity_y[i] *= -1

        # Finished drawing and processing all i of the circles.

    
    # The problem was that the next two lines were indented one additional level
    # update the drawing
    turtle.update()

    # Call this function again in 30ms. The first parameter of the ontimer
    # function must be a function that takes no arguments. That's why we use
    # global variables for this program.
    turtle.ontimer(gameloop, 30)

def main():
    global numCircles, t
    numCircles = 30
    
    initializeLists()
    
    turtle.setup(500, 500, 0, 0) # height, width, startX, startY
    
    wn = turtle.Screen()
    wn.title('Moving Circles')
    
    wn.tracer(0) # Don't draw. We'll need to use turtle.update()
    
    t = turtle.Turtle() # this is the global variable
    t.hideturtle()
    
    # call our gameloop function to start up the program
    gameloop()
    
    turtle.done()
    
main()