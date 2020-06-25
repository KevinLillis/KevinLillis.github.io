# drawSpiral.py
import turtle

def makeTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('Rosy Brown')
    myWindow.title('Draw Spiral')
    
    cuff = turtle.Turtle()
    cuff.pensize(3)
    cuff.speed(7)

    return cuff

def drawSpiral_1(link, maxSide):
    ''' Small side first, to big side last '''
    for sideLength in range(1, maxSide + 1, 5):
        link.forward(sideLength)
        link.right(90)
    
def drawSpiral_2(link, maxSide):
    ''' Big side first, to small side last '''
    for sideLength in range(maxSide, 0, -5):
        link.forward(sideLength)
        link.right(90)


def main():
    cuff = makeTurtle()
    
    #drawSpiral_1(cuff, 150)
    drawSpiral_2(cuff, 150)
    
    turtle.done()
    
main()