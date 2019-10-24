/**
 * Represents a rectangle specified by the (x,y) coordinate of the top left
 * corner as well as the width and height.
 * @author Dr. Lillis
 */

public interface RectangleInterface {
    /**
     * Returns the x coordinate of the top left corner of this rectangle.
     * @return x coordinate of top left corner of this rectangle
     */
    public int getX();
    
    /**
     * Returns the y coordinate of the top left corner of this rectangle.
     * @return y coordinate of the top left corner of this rectangle
     */
    public int getY();
    
    /**
     * Returns the width of this rectangle.
     * @return width of this rectangle
     */
    public int getWidth();
    
    /**
     * Return the height of this rectangle.
     * @return the height of this rectangle
     */
    public int getHeight();

    /**
     * Calculates and returns the area of this rectangle.
     * @return area of this rectangle
     */
    public int area();
    
    /**
     * Calculates and returns the perimeter of this rectangle.
     * @return perimeter of this rectangle
     */
    public int perimeter();
    
    /**
     * Sets the x coordinate of the top left corner of this rectangle.
     * @param x The new x coordinate of the top left corner of this rectangle.
     */
    public void setX(int x);

    /**
     * Sets the y coordinate of the top left corner of this rectangle.
     * @param y The new y coordinate of the top left corner of this rectangle.
     */
    public void setY(int y);
    
    /**
     * Sets the width of this rectangle.
     * @param width The new width of this rectangle.
     */
    public void setWidth(int width);
    
    /**
     * Sets the height of this rectangle.
     * @param height The new height of this rectangle.
     */
    public void setHeight(int height);
    
    /**
     * Sets the (x,y) coordinate of the top left corner as well as the width and
     * height of this rectangle.
     * @param x The new x coordinate of the top left corner of this rectangle.
     * @param y The new y coordinate of the top left corner of this rectangle.
     * @param width The new width of this rectangle.
     * @param height The new height of this rectangle.
     */
    public void setRect(int x, int y, int width, int height);
    
    
    /**
     * Sets the (x,y) coordinate of the top left corner as well as the width and
     * height of this rectangle to the corresponding values in the given
     * rectangle.
     * @param otherRectangle The rectangle whose values will be used for this 
     * rectangle.
     */
    public void setRect(RectangleInterface otherRectangle);

    /**
     * Moves this rectangle in the x and y direction by the amounts given.
     * @param deltaX Amount this rectangle will be moved in the x direction
     * @param deltaY Amount this rectangle will be moved in the y direction
     */
    public void translate(int deltaX, int deltaY);

    /**
     * Returns a new Rectangle object representing the intersection of this 
     * Rectangle with the specified Rectangle.
     * @param otherRectangle the Rectangle to be intersected with this Rectangle
     * @return the largest Rectangle contained in both the specified Rectangle
     * and in this Rectangle.
     */    
    public RectangleInterface createIntersection(RectangleInterface otherRectangle);
    
    /**
     * Returns true if this rectangle intersects the specified rectangle.
     * @param otherRectangle The rectangle with which this rectangle will be 
     * compared.
     * @return true if this rectangle intersects the specified rectangle, false
     * otherwise.
     */
    public boolean intersects(RectangleInterface otherRectangle);

}
