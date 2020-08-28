# turtledemo-1-basic.py

import turtle

def main():
    # Window size in pixels (width, height)
    turtle.setup(450, 450)
    
    # Access the drawing canvas
    myWindow = turtle.Screen()
    myWindow.bgcolor('CornflowerBlue')
    myWindow.title('In class turtle demo')
    
    # Create a turtle on the canvas
    cuff = turtle.Turtle()
    
    # Move the turtle around and draw some stuff
    cuff.forward(100)
    print(f'Position: {cuff.position()}, heading: {cuff.heading()}')
    
    cuff.right(90)
    cuff.forward(200)
    print(f'Position: {cuff.position()}, heading: {cuff.heading()}')
    
    
    # Allow turtle window to be closed
    turtle.done()
    
main()