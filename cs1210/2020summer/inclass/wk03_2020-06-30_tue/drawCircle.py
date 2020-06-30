# drawCircle.py
import turtle
import math

def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('azure')
    myWindow.title('Draw Circle')
    
    myTurtle = turtle.Turtle()    
    myTurtle.speed(7)
    return myTurtle

def drawPolygon(myTurtle, sideLen, numSides):
    angle = 360 / numSides
    for i in range(numSides):
        myTurtle.forward(sideLen)
        myTurtle.right(angle)

def drawCircle(myTurtle, radius):
    numSides = 30
    sideLen = (2 * math.pi * radius) / numSides
    drawPolygon(myTurtle, sideLen, numSides)

def polygonTester(aTurtle):
    sideLength = 250
    numOfSides = 3
    drawPolygon(aTurtle, sideLength, numOfSides)
    
def circleTester(aTurtle):
    radius = 150
    drawCircle(aTurtle, 100)
    
def main():
    cuff = makeTurtle()
    #polygonTester(cuff)
    circleTester(cuff)
    
    turtle.done()
    
main()