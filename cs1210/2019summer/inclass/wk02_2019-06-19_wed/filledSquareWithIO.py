import turtle

def getNewTurtle():
    turtle.setup(450, 450)
    wn = turtle.Screen()
    wn.bgcolor('yellow')
    wn.title('Filled Square')
    
    myTurtle = turtle.Turtle()
    myTurtle.pencolor('red')
    myTurtle.fillcolor('blue')
    myTurtle.pensize(5)
    
    return myTurtle

def main():
    # ask the user how long each side should be
    prompt = 'Enter side length'
    title = 'Getting Input'
    sideLen = int(turtle.textinput(title, prompt))
    
    # draw the filled square
    brad = getNewTurtle()

    brad.begin_fill()
    
    brad.forward(sideLen)
    brad.left(90)
    
    brad.forward(sideLen)
    brad.left(90)

    brad.forward(sideLen)
    brad.left(90)

    brad.forward(sideLen)
    brad.left(90)
    
    brad.end_fill()
    
    # Write a message
    message = 'Area is ' + str(sideLen * sideLen)

    brad.up()
    brad.hideturtle()
    brad.color('black')
    brad.goto(0, -100)
    
    myFont = ('Arial', 16, 'bold')
    brad.write(message, False, 'center', myFont)
    
    # We're done
    turtle.done()
    
main()