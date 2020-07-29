import turtle

def drawSquare(t, sideLen):
    '''
    Helper function that draws a single square. 
    Not recursive
    '''
    
    for i in range(4):
        t.forward(sideLen)
        t.right(90)
        
def nestedSquares1(t, sideLen):
    '''Non-recursive - Big SQ first - down to smallest SQ'''
    for side in range(sideLen, 1, -10):
        drawSquare(t, side)

def nestedSquares2(t, sideLen):
    '''Recursive - Tail Recursion - Big SQ first - down to smallest SQ'''
    # Check for base case
    if sideLen <= 1:
        return
    
    drawSquare(t, sideLen)
    
    # Now do recursive call
    nestedSquares2(t, sideLen - 10)

def nestedSquares3(t, sideLen):
    '''Recursive - Not Tail Recursion - Small SQ 1st - up to biggest SQ'''
    # Check for base case
    if sideLen <= 1:
        return

    nestedSquares3(t, sideLen - 10)
    drawSquare(t, sideLen)


def main():
    turtle.setup(500, 500)
    link = turtle.Turtle()
    link.speed('fast')
    
    #nestedSquares1(link, 100)
    # nestedSquares2(link, 100)
    nestedSquares3(link, 100)
    
    turtle.done()
    
main()