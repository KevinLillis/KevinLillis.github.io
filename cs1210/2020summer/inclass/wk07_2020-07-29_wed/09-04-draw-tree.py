import turtle
# Drawing a tree. Based on Miller's textbook
def drawTree(t, trunkLen):
    # Check for base case
    if trunkLen < 5:
        return

    t.forward(trunkLen)
    t.right(30)
    drawTree(t, trunkLen - 15)
    t.left(60)
    drawTree(t, trunkLen - 15)
    t.right(30)
    t.backward(trunkLen)

def main():
    link = turtle.Turtle()
    link.speed('fast') 
 
    # place turtle in the correct starting spot todraw the tree
    link.up()
    link.left(90)
    link.backward(200)
    link.down()

    # Draw the tree
    drawTree(link, 117)

    turtle.done()

main()
