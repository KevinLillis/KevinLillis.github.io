import turtle

def makeNewTurtle():
    turtle.setup(450, 450)
    wn = turtle.Screen()
    wn.bgcolor('Rosy Brown')
    wn.title('Draw Spiral')
    
    myTurtle = turtle.Turtle()
    myTurtle.pensize(3)
    return myTurtle

def drawSpiral_1(tur, maxSideLength):
    # From the inside out (small to big)
    for sideLength in range(1, maxSideLength, 5):
        tur.forward(sideLength)
        tur.right(90)

def drawSpiral_2(tur, maxSideLength):
    # From the outside in (big to small)
    for sideLength in range(maxSideLength, 1, -5):
        tur.forward(sideLength)
        tur.right(90)

def main():
    steve = makeNewTurtle()
    
    # do some drawing here
    drawSpiral_1(steve, 200)
    
    turtle.done()
    
main()