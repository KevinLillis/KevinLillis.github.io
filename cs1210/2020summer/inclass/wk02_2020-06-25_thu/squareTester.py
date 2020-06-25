# squareTester.py
import turtle
#import ds_1 as ds
import ds_2 as ds


def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('goldenrod')
    myWindow.title('Draw Square Tester')

    return turtle.Turtle()


def main():
    link = makeTurtle()

    side = 200
    ds.drawSquare(link, side)

    side -= 20
    ds.drawSquare(link, side)

    side -= 20
    ds.drawSquare(link, side)

    side -= 20
    ds.drawSquare(link, side)

    side -= 20
    ds.drawSquare(link, side)

    turtle.done()


main()
