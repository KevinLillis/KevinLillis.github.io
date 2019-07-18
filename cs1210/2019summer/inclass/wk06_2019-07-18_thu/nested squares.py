import turtle

def drawSquare(t, sideLen):
    ''' helper function. Just draws a square. Not recursive'''
    for i in range(4):
        t.forward(sideLen)
        t.right(90)
        
def nestedSquaresA(t, sideLen):
    '''Using tail-recursion'''
    # Check for base case
    if sideLen <= 1:
        return # doesn't draw anything
    
    drawSquare(t, sideLen) # Draw this square
    nestedSquaresA(t, sideLen - 10) # Draw the smaller set of nested squares

def nestedSquaresB(t, sideLen):
    '''Doesn't use tail-recursion'''
    # Check for base case
    if sideLen <= 1:
        return # doesn't draw anything

    nestedSquaresB(t, sideLen - 10) # Draw the smaller set of nested squares
    drawSquare(t, sideLen) # Draw this square
    
    
def main():
    turtle.setup(500, 500)
    bob = turtle.Turtle()
    bob.speed('fast')
    nestedSquaresB(bob, 150)
    
    turtle.done()
    
main()