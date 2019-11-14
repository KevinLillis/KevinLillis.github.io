
public interface ThreePointsInterface {

    /**
     * Sets the (x, y) coordinates of all three points
     * @param x0 The x coordinate of point 0
     * @param y0 The y coordinate of point 0
     * @param x1 The x coordinate of point 1
     * @param y1 The y coordinate of point 1
     * @param x2 The x coordinate of point 2
     * @param y2 The y coordinate of point 2
     */
    void setPoints(double x0, double y0, double x1, double y1, double x2,
            double y2);
    
    /**
     * Returns the value of x0.
     * @return the value of x0.
     */
    double getX0();

    /**
     * Returns the value of y0.
     * @return the value of y0.
     */
    double getY0();

    /**
     * Returns the value of x1.
     * @return the value of x1.
     */
    double getX1();

    /**
     * Returns the value of y1.
     * @return the value of y1.
     */
    double getY1();

    /**
     * Returns the value of x2.
     * @return the value of x2.
     */
    double getX2();

    /**
     * Returns the value of y2.
     * @return the value of y2.
     */
    double getY2();
    
    /**
     * Returns the length of the specified side (s0, s1, or s2). Returns zero if
     * the three points do not form a triangle.
     * @param side Expected to be 0, 1, or 2 to specify side s0, s1, or s2 (see
     * Figure 1 of the assignment)
     * @return the length of the specified side or zero if the three points do
     * not form a triangle.
     */
    double getLength(int side);
    
    /**
     * Returns the angle of the specified vertex (v0, v1, or v2). Returns zero
     * if the three points do not form a triangle.
     * @param vertex Expected to be 0, 1, or 2 to specify angle a0, a1, or a2
     * (see Figure 1 of the assignment)
     * @return the angle of the specified vertex or zero of the three points
     * do not form a triangle.
     */
    double getAngle(int vertex);
    
    /**
     * Returns true if the three points form a triangle, 
     * returns false otherwise.
     * @return true if the three points form a triangle, returns 
     * false otherwise.
     */
    boolean isTriangle();
    
    /**
     * Returns true if the three points form a triangle and that triangle is
     * equilateral, returns false otherwise.
     * @return true if the three points form a triangle and that triangle is
     * equilateral, returns false otherwise.
     */
    boolean isEquilateral();
    
    /**
     * Returns true if the three points form a triangle and that triangle is 
     * isosceles, returns false otherwise.
     * @return true if the three points form a triangle and that triangle is 
     * isosceles, returns false otherwise.
     */
    boolean isIsosceles();
    
    /**
     * Returns true if the three points form a triangle and that triangle is 
     * scalene, returns false otherwise.
     * @return true if the three points form a triangle and that triangle is 
     * scalene, returns false otherwise.
     */
    boolean isScalene();
    
    /**
     * Returns true if the three points form a triangle and that triangle is 
     * acute, returns false otherwise.
     * @return true if the three points form a triangle and that triangle is 
     * acute, returns false otherwise.
     */
    boolean isAcute();
    
    /**
     * Returns true if the three points form a triangle and that triangle is 
     * obtuse, returns false otherwise.
     * @return true if the three points form a triangle and that triangle is 
     * obtuse, returns false otherwise.
     */
    boolean isObtuse();
    
    /**
     * Returns true if the three points form a triangle and that triangle is a 
     * right triangle, returns false otherwise.
     * @return true if the three points form a triangle and that triangle is a 
     * right triangle, returns false otherwise.
     */
    boolean isRight();
    
    /**
     * Returns the perimeter of the triangle. Returns zero if the three points 
     * do not form a triangle.
     * @return the perimeter of the triangle. Returns zero if
     * the three points do not form a triangle.
     */
    double getPerimeter();
    
    /**
     * Returns the area of the triangle. Returns zero if the three points do 
     * not form a triangle.
     * @return the perimeter of the triangle. Returns zero if
     * the three points do not form a triangle.
     */
    double getArea();    
}
