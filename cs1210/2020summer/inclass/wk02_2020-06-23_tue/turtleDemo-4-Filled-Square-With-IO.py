import turtle


def getNewTurtle():
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
    # ask the user how long each side should be
    prompt = 'Enter side length'
    title = 'Getting Input'
    sideLen = int(turtle.textinput(title, prompt))

    # draw the filled square
    link = getNewTurtle()

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

    # Write a message
    message = f'Area is {sideLen * sideLen}'

    link.up()
    link.hideturtle()
    link.color('black')
    link.goto(0, -100)

    myFont = ('Arial', 16, 'bold')
    link.write(message, False, 'center', myFont)

    # We're done
    turtle.done()


main()
