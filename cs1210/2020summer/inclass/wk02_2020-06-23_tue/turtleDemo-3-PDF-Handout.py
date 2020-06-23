# turtleDemo.py
import turtle


def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('CornflowerBlue')
    myWindow.title('In class turtle Demo')

    return turtle.Turtle()


def main():
    cuff = makeTurtle()

    # Now do the drawing
    cuff.forward(100)
    cuff.right(90)
    cuff.forward(100)
    cuff.goto(0, 0)

    cuff.forward(100)
    cuff.right(90)
    cuff.forward(100)
    cuff.goto(0, 0)

    cuff.forward(100)
    cuff.right(90)
    cuff.forward(100)
    cuff.goto(0, 0)

    cuff.forward(100)
    cuff.right(90)
    cuff.forward(100)
    cuff.goto(0, 0)

    # Draw smaller, filled triangles with a fatter line
    cuff.pensize(3)
    cuff.pencolor('yellow')
    cuff.fillcolor('red')

    cuff.begin_fill()
    cuff.forward(50)
    cuff.right(90)
    cuff.forward(50)
    cuff.goto(0, 0)
    cuff.end_fill()

    cuff.begin_fill()
    cuff.forward(50)
    cuff.right(90)
    cuff.forward(50)
    cuff.goto(0, 0)
    cuff.end_fill()

    cuff.begin_fill()
    cuff.forward(50)
    cuff.right(90)
    cuff.forward(50)
    cuff.goto(0, 0)
    cuff.end_fill()

    cuff.begin_fill()
    cuff.forward(50)
    cuff.right(90)
    cuff.forward(50)
    cuff.goto(0, 0)
    cuff.end_fill()

    # we're done
    cuff.hideturtle()
    turtle.done()


main()
