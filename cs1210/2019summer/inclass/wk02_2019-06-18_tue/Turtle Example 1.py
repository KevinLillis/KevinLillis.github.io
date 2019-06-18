import turtle

def main():
    # Set the size of the window
    turtle.setup(450, 450)
    
    # set up the wihdow so it looks nice
    myWindow = turtle.Screen()
    myWindow.bgcolor('lightblue')
    myWindow.title('CS I')
    
    # Create two turtle objects and interact with them
    frank = turtle.Turtle()
    frank.forward(100)

    elaine = turtle.Turtle()
    elaine.right(90)
    elaine.forward(100)
    
    
    
    turtle.done() # without this, you can't close the window
    
main()