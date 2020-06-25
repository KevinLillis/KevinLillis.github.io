# ds_2.py
'''
Draw Square, Second version, uses repetition
'''

def drawSquare(cuff, sideLength):
    for i in range(4):
        cuff.forward(sideLength)
        cuff.right(90)
