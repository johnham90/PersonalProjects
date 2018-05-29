package ca.bcit.comp1510.lab11;

/**
 * Matrix represents a matrix.
 *
 * @author John Ham
 * @version 2018
 */
public class Matrix {
    
    /** 2D array of integers. */
    private int[][] intArray;
    
    /**
     * Constructs an object of type Matrix.
     *
     * @param row
     *          integer for number of rows
     * @param column
     *          integer for number of columns
     */
    public Matrix(int row, int column) {
        intArray = new int[row][column];
    }
    
    /**
     * Returns the number of rows the matrix has.
     * 
     * @return integer
     */
    public int getRow() {
        return intArray.length;
    }
    
    /**
     * Returns the number of columns the matrix has.
     * 
     * @return integer
     */
    public int getColumn() {
        return intArray[0].length;
    }
    
    /**
     * Returns the value at a certain row and column.
     * 
     * @param row
     *          integer for row
     * @param column
     *          integer for column
     * @return integer
     */
    public int getValue(int row, int column) {
        return intArray[row][column];
    }
    
    /**
     * Sets the value at a certain row and column.
     * 
     * @param value
     *          integer for value
     * @param row
     *          integer for row
     * @param column
     *          integer for column
     */
    public void setValue(int value, int row, int column) {
        intArray[row][column] = value;
    }
    
    /**
     * Adds another matrix to the current matrix. If the size of the matrices
     * are different, an error message is printed.
     * 
     * @param matrix
     *          Matrix object to add
     * @return Matrix object
     */
    public Matrix add(Matrix matrix) {
//        if (this.getRow() != matrix.getRow() || this.getColumn() 
//                    != matrix.getColumn()) {
//            throw new IllegalArgumentException(
//                    "The matrices are not of the same size!");
//        }
//        
//        Matrix newMatrix = new Matrix(this.getRow(), this.getColumn());
//        
//        for (int row = 0; row < intArray.length; row++) {
//            for (int column = 0; column < intArray[row].length; column++) {
//                int result = this.getValue(row, column) 
//                + matrix.getValue(row, column);
//                newMatrix.setValue(result, row, column);
//            }
//        }
        Matrix newMatrix = new Matrix(this.getRow(), this.getColumn());
        
        try {
            for (int row = 0; row < intArray.length; row++) {
                for (int column = 0; column < intArray[row].length; column++) {
                    int result = this.getValue(row, column) 
                            + matrix.getValue(row, column);
                    newMatrix.setValue(result, row, column);
                }
            }    
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The matrices are not of the same size!");
        }
        return newMatrix;
        
    }
    
    /**
     * Returns a string representation of the matrix.
     * 
     * @see java.lang.Object#toString()
     * @return string
     */
    public String toString() {
        String matrix = "";
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[row].length; column++) {
                matrix += intArray[row][column] + "\t";
            }
            matrix += "\n";
        }
        return matrix;
    }
}
