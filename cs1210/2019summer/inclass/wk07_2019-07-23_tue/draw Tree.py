import turtle

def tree(t, trunkLen):
    # Check for base case
    if trunkLen < 1:
        return
    
    # Recursively draw the tree
    
    # 1) Draw the trunk
    t.forward(trunkLen)
    
    # 2) Draw the right sub-tree
    t.right(30)
    tree(t, trunkLen - 15)
    
    # 3) Draw the left sub-tree
    t.left(60)
    tree(t, trunkLen - 15)
    
    # Return to starting point
    t.right(30)
    t.backward(trunkLen)
    
    

def main():
    myTurtle = turtle.Turtle()
    myTurtle.speed('fastest')
    
    # Move to starting point and correct orientation
    myTurtle.up()
    myTurtle.left(90) # Meke the turtle point upward
    myTurtle.backward(200)
    myTurtle.down()
    
    # Kick off the recursive calls
    tree(myTurtle, 117)
    
    # We're finished
    turtle.done()
    
main()