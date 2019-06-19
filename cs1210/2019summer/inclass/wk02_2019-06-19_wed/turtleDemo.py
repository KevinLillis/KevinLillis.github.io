# turtleDemo.py

import turtle

def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('Lavender')
    myWindow.title('In class on Wednesday')
    
    return turtle.Turtle()

def main():
    bob = makeTurtle()
    
    # Now do the drawing
    bob.forward(100)
    bob.right(90)
    bob.forward(100)
    bob.goto(0,0)
    
    bob.forward(100)
    bob.right(90)
    bob.forward(100)
    bob.goto(0,0)
    
    bob.forward(100)
    bob.right(90)
    bob.forward(100)
    bob.goto(0,0)
    
    bob.forward(100)
    bob.right(90)
    bob.forward(100)
    bob.goto(0,0)
    
    # Draw smaller, filled triangles with a fatter line
    bob.pensize(3)
    bob.pencolor('blue')
    bob.fillcolor('red')
    
    bob.begin_fill()
    bob.forward(50)
    bob.right(90)
    bob.forward(50)
    bob.goto(0,0)
    bob.end_fill()
    
    bob.begin_fill()
    bob.forward(50)
    bob.right(90)
    bob.forward(50)
    bob.goto(0,0)
    bob.end_fill()
    
    bob.begin_fill()
    bob.forward(50)
    bob.right(90)
    bob.forward(50)
    bob.goto(0,0)
    bob.end_fill()
    
    bob.begin_fill()
    bob.forward(50)
    bob.right(90)
    bob.forward(50)
    bob.goto(0,0)
    bob.end_fill()
    
    # we're done
    bob.hideturtle()    
    turtle.done()
    
main()

