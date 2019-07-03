import turtle

# Make the window 450 x 450 pixels
turtle.setup(450, 450)

wn = turtle.Screen()

# Set the background color
wn.bgcolor('Rosy Brown')

# Set the window title
wn.title('Looking at the Turtle')

# Make the turtle
bob = turtle.Turtle()

# Use the turtle to do some drawing
bob.forward(100)
bob.left(90)
bob.forward(100)

# We're all done drawing
turtle.done()
