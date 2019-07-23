import turtle

def drawTriangle(t, triangle):
    '''
    This function just draws a triangle. That's it.
    The triangle argumet is a tuple of three points (p1, p2, p3).
    Each point is a tuple with (x, y).
    '''
    
    # pull out the three individual points
    p1, p2, p3 = triangle
    
    t.up()
    t.goto(p1)
    t.down()
    
    t.goto(p2)
    t.goto(p3)
    t.goto(p1)
    
    t.up()

def midpoint(p1, p2):
    '''
    Calculate and return the midpoint of two points.
    p1 = (x1, y1) and p2 = (x2, y2)
    '''
    
    # pull out the individual coordinates
    x1, y1 = p1
    x2, y2 = p2
    
    midx = (x1 + x2) / 2
    midy = (y1 + y2) / 2
    
    return (midx, midy) # return point as a tuple

def sierpinski(t, triangle, depth):
    '''
    The parameter triangle is a tuple of three 
    points ((x1, y1), (x2, y2), (x3, y3))
    '''
    
    # Check for base case
    if depth <= 0:
        drawTriangle(t, triangle)
        return
    
    # Pull out the three individual points
    p1, p2, p3 = triangle
    
    # Make the three smaller triangles
    triangle1 = (p1, midpoint(p1, p2), midpoint(p1, p3))
    triangle2 = (p2, midpoint(p2, p1), midpoint(p2, p3))
    triangle3 = (p3, midpoint(p3, p1), midpoint(p3, p2))
    
    # Recursively call sierpinski on each smaller triangle
    sierpinski(t, triangle1, depth - 1)
    sierpinski(t, triangle3, depth - 1)
    sierpinski(t, triangle2, depth - 1)
    
def main():
    myTurtle = turtle.Turtle()
    myTurtle.speed('fastest')
    
    tri = ((-250, -150), (250, -150), (0, 270))
    
    depth = 4 # increase depth for cooler pictures
    sierpinski(myTurtle, tri, depth)
    
    turtle.done()
    
main()
    