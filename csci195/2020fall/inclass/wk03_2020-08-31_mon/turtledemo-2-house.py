# turtledemo-2-House.py

import turtle

def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('CornflowerBlue')
    myWindow.title('A House')
    
    link = turtle.Turtle()
    return link

def main():
    cuff = makeTurtle()
    
    # Draw the square house
    cuff.forward(100)
    cuff.left(90)
    
    cuff.forward(50)
    x, y = cuff.position() # save position for later
    
    cuff.left(90)
    cuff.forward(100)
    cuff.goto(0, 0)
    
    # Goto top-right corner and draw the roof
    cuff.up()
    cuff.goto(x, y)
    cuff.down()
    cuff.goto(x/2, y + 40)
    cuff.goto(0, y)
    
    # Draw sun, use second variable for the same turtle
    link = cuff
    link.up()
    #link.goto(-230, 230)
    link.goto(-170, 170)
    link.down()
    link.color('yellow')
    link.begin_fill()
    link.circle(20)
    link.end_fill()
    
    link.hideturtle()
    
    turtle.done()
    
main()
    