/**
 *
 * @author Dr. Lillis
 */
public interface Matrix {
    /**
     * Returns the maximum element in this matrix.
     * @return Largest matrix element
     */
    int getMax();
    
    /**
     * Returns the minimum element in this matrix.
     * @return Smallest matrix element
     */
    int getMin();
    
    /**
     * Returns the width of this matrix.
     * @return the width this matrix
     */
    int getM();
    
    /**
     * Returns the height of this matrix.
     * @return the height of this matrix
     */
    int getN();
    
    /**
     * Returns the element stored at row i, column j
     * @param i row index
     * @param j column index
     * @return element at row i, column j
     * @throws IndexOutOfBoundsException if i is out of range for the rows or
     * j is out of range for the columns
     */
    int get(int i, int j) throws IndexOutOfBoundsException;
    
    
    /**
     * Sets the element at row i, column j to the specified value.
     * @param i row index
     * @param j column index
     * @throws IndexOutOfBoundsException if i is out of range for the rows or
     * j is out of range for the columns
     */
    void set(int i, int j, int value) throws IndexOutOfBoundsException;
    
    /**
     * Returns true if this matrix is a vector.
     * @return true if this matrix is a vector
     */
    boolean isVector();
    
    /**
     * Returns true if this is a square matrix.
     * @return true if this is a square matrix
     */
    boolean isSquare();
    
    /**
     * Returns true if this is a diagonal matrix.
     * @return true if this is a diagonal matrix
     */
    boolean isDiagonal();
    
    /**
     * Returns true if this is a scalar matrix.
     * @return true if this is a scalar matrix.
     */
    boolean isScalar();
    
    /**
     * Returns true if this is a scalar matrix.
     * @return true if this is a scalar matrix.
     */
    boolean isIdentity();
    
    /**
     * Returns true if this is an identity matrix.
     * @return true if this is an identity matrix.
     */
    boolean isSymmetric();
    
    /**
     * Returns true if this is a symmetric matrix.
     * @return true if this is a symmetric matrix.
     */
    boolean isSkewSymmetric();

    /**
     * Returns this + other
     * @param other matrix to add to this matrix
     * @return this + other
     * @throws IncompatibleMatricesException 
     */
    SparseMatrix add(SparseMatrix other) throws IncompatibleMatricesException;
    
    /**
     * Returns Matrix resulting from scalar multiplication of r and this.
     * @param r value to multiply this matrix by
     * @return Matrix resulting from scalar multiplication of r and this
     */
    SparseMatrix scalarMultiply(int r);

    /**(
     * Returns this - other
     * @param other Matrix to perform difference
     * @return this - other
     * @throws IncompatibleMatricesException 
     */
    SparseMatrix difference(SparseMatrix other) throws IncompatibleMatricesException;
    
    /**
     * Returns transposition of this matrix.
     * @return transposition of this matrix
     */
    SparseMatrix transpose();
    
    /**
     * Returns dot product of this and other
     * @param other matrix for computing dot product
     * @return dot product of this and other
     * @throws IncompatibleMatricesException 
     */
    int dotProduct(SparseMatrix other) throws IncompatibleMatricesException;
    
    /**
     * Returns this x other
     * @param other matrix to multiply this matrix by
     * @return this X other
     * @throws IncompatibleMatricesException 
     */
    SparseMatrix multiply(SparseMatrix other) throws IncompatibleMatricesException;
    
    /**
     * Returns the matrix obtained from this matrix by removing row i and column j
     * @param i row to be removed
     * @param j column to be removed
     * @return the matrix obtained from this matrix by removing row i and column j
     * @throws IndexOutOfBoundsException if i is out of range for the rows or
     * j is out of range for the columns
     */
    SparseMatrix subMatrix(int i, int j) throws IndexOutOfBoundsException;
    
    /**
     * Returns true if this is equal to the given object.
     * @param o Object to compare to this
     * @return true if this is equal to the given object.
     */
    @Override
    boolean equals(Object o);
    
    /**
     * Returns a string with the dimensions of the matrix and the number of 
     * non-zero entries.
     * @return a string with the dimensions of the matrix and the number of 
     * non-zero entries.
     */
    @Override
    String toString();
    
    /**
     * Returns a formatted string showing the matrix in tabular form. 
     * The width of the table columns are all be the same and set according to
     * the largest number of characters required to show any element in the 
     * matrix. Zeros are shown as dashes.
     * @return a formatted string showing the matrix in tabular form
     */
    String toString1();
}
