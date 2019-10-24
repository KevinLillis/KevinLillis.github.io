/**
 *
 * @author Dr. Lillis
 */
public class Rectangle implements RectangleInterface {
    // Static Constants
    public static final int DEFAULT_X = 0;
    public static final int DEFAULT_Y = 0;
    public static final int DEFAULT_WIDTH = 1;
    public static final int DEFAULT_HEIGHT = 1;
    
    // Instance Variables
    private int x; // x oordinate of top-left corder
    private int y;
    private int width;
    private int height;
    
    // Constructors
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int x, int y){
        this(x, y, Rectangle.DEFAULT_WIDTH, Rectangle.DEFAULT_HEIGHT);
    }
    
    public Rectangle(){
        this(Rectangle.DEFAULT_X, Rectangle.DEFAULT_Y, Rectangle.DEFAULT_WIDTH,
                Rectangle.DEFAULT_HEIGHT);
    }
    
    public Rectangle(RectangleInterface otherRectangle){
        this(otherRectangle.getX(), otherRectangle.getY(),
                otherRectangle.getWidth(), otherRectangle.getHeight());
    }
    
    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }

    @Override
    public int perimeter() {
        return (this.width + this.height) * 2;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void setRect(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void setRect(RectangleInterface otherRectangle) {
        this.x = otherRectangle.getX();
        this.y = otherRectangle.getY();
        this.width = otherRectangle.getWidth();
        this.height = otherRectangle.getHeight();
    }

    @Override
    public void translate(int deltaX, int deltaY) {
        this.x += deltaX;
        this.y += deltaY;
    }

    @Override
    public RectangleInterface createIntersection(RectangleInterface otherRectangle) {
        int r1_TL_x = this.x;
        int r1_TL_y = this.y;
        int r1_BR_x = this.x + this.width;
        int r1_BR_y = this.y + this.height;
        
        int r2_TL_x = otherRectangle.getX();
        int r2_TL_y = otherRectangle.getY();
        int r2_BR_x = otherRectangle.getX() + otherRectangle.getWidth();
        int r2_BR_y = otherRectangle.getY() + otherRectangle.getHeight();
        
        
        int r3_TL_x = Math.max(r1_TL_x, r2_TL_x);
        int r3_TL_y = Math.max(r1_TL_y, r2_TL_y);
        int r3_BR_x = Math.max(r1_BR_x, r2_BR_x);
        int r3_BR_y = Math.max(r1_BR_y, r2_BR_y);
        
        int r3_width = r3_BR_x - r3_TL_x;
        int r3_height = r3_BR_y - r3_TL_y;
        
        if(r3_width <= 0 || r3_height <= 0){
            return null;
        } else {
            RectangleInterface r3 = new Rectangle(r3_TL_x, r3_TL_y,
            r3_width, r3_height);
            
            return r3;
        }
        
    }

    @Override
    public boolean intersects(RectangleInterface otherRectangle) {
        RectangleInterface r = this.createIntersection(otherRectangle);
        
        return r != null;
    }

}
