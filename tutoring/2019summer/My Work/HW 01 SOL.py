import turtle

def drawRectangle(t, x, y, width, height):
    '''
    Draws rectangle with upper left corder at (x,y) and the given
    width and height.
    '''
    t.up() # Make sure no line is drawn when we go to (x, y)
    
    t.goto(x, y) # Go to the top left corner of the rectangle we'll draaw
    t.setheading(0) # Make sure the turtle is facing zero degrees (to the right)
    
    t.down() # Put the pen down to start drawing

    t.forward(width) # Draw the top line, Left-to-Right
    t.right(90)

    t.forward(height) # Draw the right side, Top-to-Bottom
    t.right(90)
    
    t.forward(width) # Draw the bottom line, Right-to-Right
    t.right(90)

    t.forward(height) # # Draw the left side, Bottom-to-Too
    t.right(90)
    
    t.up() # Pick up the pen before returning from this function
    
def linedRectangle(t, x, y, width, height):
    '''
    Draw a rectangle with a diagonal line from the top-left to the bottom-right.
    '''
    
    # Start by using the above function to draw the rectangle.
    drawRectangle(t, x, y, width, height)

    t.up() # pick the pen up before moving to the starting position
    
    t.goto(x,y) # Go to the top-left corner of the recalgle.

    t.down() # Put the pen down to start drawing
    
    # Go to the bottom-right corner. This will draw the diagonal line.
    t.goto(x + width, y - height) 
    
    t.up() # Pick the pen up before returning from this function
    
def makeTurtle():
    '''
    In this function we're going to create and configure a turtle, then
    return the turtle.
    '''
    # Make the window 450 x 450 pixels
    turtle.setup(450, 450)

    bob = turtle.Turtle()

    return bob

def main():
    jason = makeTurtle()
    
    w, h = 100, 50
    for value in range(-50, 50, 5):
        x, y = value, value
        linedRectangle(jason, x, y, w, h)
        
    # We're done using the turtle.    
    turtle.done()

main()