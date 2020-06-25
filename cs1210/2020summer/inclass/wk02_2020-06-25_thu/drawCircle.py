# drawCircle.py
import turtle

def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('azure')
    myWindow.title('Draw Circle')
    
    cuff = turtle.Turtle()
    cuff.speed(7)

    return cuff

def drawPolygon(tur, sideLen, numSides):
    angle = 360 / numSides
    for i in range(numSides):
        tur.forward(sideLen)
        tur.right(angle)

def polygonTester(cuff):
    sideLen = 50
    numberOfSides = 10
    drawPolygon(cuff, sideLen, numberOfSides)

    sideLen = 50
    numberOfSides = 3
    drawPolygon(cuff, sideLen, numberOfSides)

    sideLen = 20
    numberOfSides = 10
    drawPolygon(cuff, sideLen, numberOfSides)


def main():
    link = makeTurtle()
    
    polygonTester(link)
    
    turtle.done()
    
main()