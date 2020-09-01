# Filled-with-text.py

import turtle

def makeNewTurtle():
    turtle.setup(450, 450)
    myWindow = turtle.Screen()
    myWindow.bgcolor('yellow')
    myWindow.title('Filled Square')
    
    cuff = turtle.Turtle()
    cuff.pencolor('red')
    cuff.fillcolor('blue')
    cuff.pensize(5)
    
    return cuff

def main():
    # Ask the user how long each side should be
    prompt = 'Enter side length'
    title = 'Getting Input'
    sideLen = int(turtle.textinput(title, prompt))
    
    # draw a filled square with the given side length
    link = makeNewTurtle()
    
    link.begin_fill()
    
    link.forward(sideLen)
    link.left(90)
    
    link.forward(sideLen)
    link.left(90)

    link.forward(sideLen)
    link.left(90)

    link.forward(sideLen)
    link.left(90)

    link.end_fill()
    
    # Calculate and display the area
    
    # Make message to display
    message = f'Area is {sideLen * sideLen}'
    
    link.up()
    link.hideturtle()
    link.color('black')
    link.goto(0, -100)
    
    myFont = ('Arial', 16, 'bold')
    link.write(message, False, 'center', myFont)
    
    
    turtle.done()
main()
    