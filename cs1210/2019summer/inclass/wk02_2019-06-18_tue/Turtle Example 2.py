import turtle

def makeTurtle():
    '''Create and return an turtle object'''
    ourWindow = turtle.Screen()
    ourWindow.title('My window title')
    tur = turtle.Turtle()
    return tur

def main():
    frank = makeTurtle()
    frank.forward(100)
    
    turtle.done()
    
main()