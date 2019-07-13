def main():
    # Here is the hint for the homework:
    # You need to run the linedRectangle function lots of times.
    # This should be done with a for loop.
    # Below is a for loop that produces and prints the correct values for
    # x, y, w, and h:
    
    w, h = 100, 50
    for value in range(-50, 50, 5):
        x, y = value, value
        print(x, y, w, h)
        
    # Instead of printing x, y, w, h you need to call the linesRectange function
    # with these values. Notice that 20 lines are printed. That means there
    # will be 20 lined rectangles drawn.

main()