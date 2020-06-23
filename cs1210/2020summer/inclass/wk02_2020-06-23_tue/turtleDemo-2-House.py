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

    # Draw the square house
    cuff.forward(100)
    cuff.left(90)
    print(cuff.heading()) # Just to show we can
    
    cuff.forward(50)
    x, y = cuff.position() # save pos for later
    
    cuff.left(90)
    cuff.forward(100)
    cuff.goto(0, 0)
    
    # goto top-right corner & draw roof
    cuff.up()
    cuff.goto(x, y)
    cuff.down()
    cuff.goto(x/2, y+40) # center and up. No angle needed
    cuff.goto(0,y) # back to top-left corner
    
    # Draw sun, use second variable for same turtle
    link = cuff
    link.up()
    link.goto(-170,170)
    link.down()
    link.color('yellow')
    link.begin_fill()
    link.circle(20)
    link.end_fill()
    
    link.hideturtle()

    # we're done
    turtle.done()


main()
