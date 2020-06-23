import turtle

def main():
    # Window size in pixels (width, height)
    turtle.setup(450, 550)

    # Access the drawing canvas
    myWindow = turtle.Screen()
    myWindow.bgcolor('CornflowerBlue')
    myWindow.title('In class turtle Demo')

    # Create a turtle on the canvas
    cuff = turtle.Turtle()

    # Tell the turtle to draw
    cuff.forward(100)
    print(f'Position: {cuff.position()}, heading: {cuff.heading()}')

    cuff.right(90)
    cuff.forward(100)
    print(f'Position: {cuff.position()}, heading: {cuff.heading()}')

    # Allows turtle window to be closed    
    turtle.done()
    
main()
