# drawSpiral.py
import turtle


def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('Rosy Brown')
    myWindow.title('Draw Spiral')

    myTurtle = turtle.Turtle()
    myTurtle.pensize(3)
    myTurtle.speed(7)

    return myTurtle


def drawSpiral_1(cuff, maxSide):
    ''' Draw small to big'''
    for sideLen in range(1, maxSide + 1, 5):
        cuff.forward(sideLen)
        cuff.right(90)


def drawSpiral_2(cuff, maxSide):
    ''' Draw big to small '''
    for sideLen in range(maxSide, 0, -5):
        cuff.forward(sideLen)
        cuff.right(90)


def main():
    link = makeTurtle()
    # drawSpiral_1(link, 150)
    drawSpiral_2(link, 150)

    turtle.done()


main()
