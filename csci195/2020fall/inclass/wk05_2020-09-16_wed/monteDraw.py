# monteDraw.py
import turtle
import random


def main():
    # Get the user input - How many throws
    numThrows = int(turtle.textinput('Monte Carlo', 'How many throws'))

    # Create the turtle
    tur = getTurtle(numThrows)

    # Draw the background
    drawBackground(tur)

    # Perform the simulation with animation
    pi = throwDarts(tur, numThrows)

    # Display the results
    writeMessage(tur, numThrows, pi)

    # When we're all done
    turtle.done()


def getTurtle(numThrows):
    '''Set up the turtle'''
    # (LLx, LLy) & (URx, URy)
    turtle.setworldcoordinates(-2, -2, 2, 2)
    turtle.setup()  # uses the coordinates
    tur = turtle.Turtle()
    wn = tur.getscreen()
    wn.title('Monte Carlo Simulation to Approx Pi')

    # Speed up the animation
    tur.hideturtle()  # don't want to see turtle darting around

    # Limit the number of screen updates
    # draw every 10th update, but never fewer than 10
    tr = max(10, numThrows / 10)
    wn.tracer(tr)

    return tur


def drawBackground(tur):
    # Draw the coordinates
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
    tur.pensize(3)
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
    tur.circle(1, 360, 50)  # radius=1, 360 degrees, 50 sides
    tur.up()


def throwDarts(tur, numThrows):
    '''
    Computes the pi approximation while
    at the same time drawing the animation.
    '''

    # Throw darts, draw the animation, return pi approximation
    tur.up()
    tur.speed(0)  # fastest

    # This is where the simulation actually starts
    numInCircle = 0
    for i in range(numThrows):
        # Generate the (x,y) and move the turtle there
        x = random.uniform(-1, 1)
        y = random.uniform(-1, 1)
        tur.goto(x, y)

        # see if the dart landed inside the circle
        if x*x + y*y <= 1:
            # Dart is in the circle, count it & set color to blue
            numInCircle += 1
            tur.color('blue')
        else:
            # Dart is NOT in the circle. Don't count it, but set color to red
            tur.color('red')

        # Draw the dot. The turtle is either blue or red, depending on
        # the if-else statement above. Dot can be drawn even when the
        # turtle is up
        tur.dot()

    pi = 4 * (numInCircle / numThrows)
    return pi


def writeMessage(tur, numThrows, piApprox):
    tur.color('black')
    tur.goto(0, -1.5)

    message = f'n = {numThrows}.'
    message += f' Approximation for pi = {piApprox:.4f}.'

    tur.write(message, False, 'center', ('Arial', 16, 'bold'))


main()
