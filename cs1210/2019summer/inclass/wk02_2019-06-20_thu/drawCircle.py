import turtle
import math

def getATurtle():
    turtle.setup(450, 450)
    window = turtle.Screen()
    window.bgcolor('Misty Rose')
    window.title('Draw Circle')
    
    theTurtle = turtle.Turtle()
    theTurtle.pensize(3)
    return theTurtle

def drawPolygon(t, sideLen, numSides):
    angle = 360 / numSides
    
    for i in range(numSides):
        t.forward(sideLen)
        t.right(angle)
        
def drawCircle(t, radius, numSides):
    sideLen = (2 * math.pi * radius) / numSides
    drawPolygon(t, sideLen, numSides)

def main():
    tur = getATurtle()
    
    # do some drawing here
    # drawPolygon(tur, 5, 40)
    
    theRadius = 100
    numberOfSides = 60
    drawCircle(tur, theRadius, numberOfSides)
    
    turtle.done()
    
main()
