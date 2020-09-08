# drawcircle.py
import turtle
import math

def maketurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('azure')
    myWindow.title('Draw Circle')
    
    myTurtle = turtle.Turtle()
    myTurtle.speed(7)
    return myTurtle

def drawPolygon(link, sideLen, numSides):
    angle = 360 / numSides
    for i in range(numSides):
        link.forward(sideLen)
        link.right(angle)
        
def drawCircle(link, radius):
    numSides = 30
    sideLen = (2 * math.pi * radius) / numSides
    drawPolygon(link, sideLen, numSides)
      
def testPolygon(aTurtle):
    sideLength = 70
    numberOfSides = 9
    drawPolygon(aTurtle, sideLength, numberOfSides)

def testCircle(aTurtle):
    radius = 100
    drawCircle(aTurtle, radius)
  
def main():
    cuff = maketurtle()
    #testPolygon(cuff)
    testCircle(cuff)
    
    turtle.done()
    
main()