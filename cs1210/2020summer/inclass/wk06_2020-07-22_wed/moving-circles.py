import math
import turtle
import random

# define these here as global variables
# Why we use globals: turtle.timer requires a function with no parameters.
radius = 10
position_x = []
position_y = []

velocity_x = []
velocity_y = []

mainColor = []
activeColor = []

t = None  # This is for the turtle
numCircles = None
wn = None

# random.seed(20)


def drawCircle(x, y):
    # draw circle centered at (x, y)
    # uses global variable radius
    t.up()
    t.goto(x - radius, y)
    t.setheading(0)
    t.down()
    t.circle(radius)
    t.up()


def initializeLists():
    '''
    Uses global variable numCircles.
    Initializes six global lists: 
        position_x, position_y
        velocity_x, velocity_y
        mainColor, activeColor
    '''
    for i in range(numCircles):

        # Random (x, y) position for each circle
        position_x.append(random.randint(-200, 200))
        position_y.append(random.randint(-200, 200))

        # Random velocity for each circle. Larger magnitude is faster. 
        # Don't allow zero
        velocity_x.append(random.choice([-3, -2, -1, 1, 2, 3]))
        velocity_y.append(random.choice([-3, -2, -1, 1, 2, 3]))

        # Random color for each circle, each r,g,b in [0,1)
        r = random.random()
        g = random.random()
        b = random.random()
        
        # Color when circles aren't touching. Never changes
        mainColor.append([r, g, b])
        
        # Colors actually drawn by the turtle in a give timeslice
        activeColor.append([r, g, b])


def circlesTouch(i, j):
    ''' Returns True iff circles i & j touch. '''
    x1, y1 = position_x[i], position_y[i]
    x2, y2 = position_x[j], position_y[j]
    
    dist = math.hypot(x2-x1, y2-y1)
    return dist < 2 * radius


def gameloop():

    # clear the canvas and hide the turtle
    t.clear()

    # Set the color for each circle
    # If the circles don't touch, use the main color. If they do touch, use red.
    # Assumes each circle has been set to its main color.
    # If two circles touch, set their active colors to red
    # Look at all pairs of circles
    for i in range(numCircles):
        for j in range(i+1, numCircles):
            if circlesTouch(i, j):
                activeColor[i] = [1, 0, 0]  # red
                activeColor[j] = [1, 0, 0]  # red

    # Iterate through all circles
    for i in range(numCircles):

        # Set the color & fill-color for circle i
        # color is r,g,b each in [0,1)
        t.pencolor(activeColor[i][0], activeColor[i][1], activeColor[i][2])
        t.fillcolor(activeColor[i][0], activeColor[i][1], activeColor[i][2])

        # draw circle i
        t.begin_fill()
        drawCircle(position_x[i], position_y[i])
        t.end_fill()

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

    # Update all graphics
    turtle.update()

    # Call this function again in 30ms. The first parameter of the ontimer
    # function must be a function that takes no arguments. That's why we use
    # global variables for this program.
    wn.ontimer(gameloop, 30)


def main():
    global numCircles, t, wn  # So we are assigning values to the global vars
    numCircles = 20  # This is the global variable
    
    initializeLists() # Uses global variable numCircles

    turtle.setup(500, 500, 0, 0)  # width, height, startX, startY

    wn = turtle.Screen() # This is the global variable
    wn.title('Moving Circles')
    wn.tracer(0)  # Don't draw, will need to use turtle.update()

    t = turtle.Turtle()  # This is the global variable
    t.hideturtle()

    # call our gameloop function to start up the program
    gameloop()

    turtle.done()


main()
