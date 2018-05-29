package ca.bcit.comp1510.lab11;

/**
 * MatrixDriver.
 *
 * @author John Ham
 * @version 2018
 */
public class MatrixDriver {

    /** Number for 0 to use for rows and columns. */
    private static final int ZERO = 0;
    
    /** Number 1 to use for rows and columns. */
    private static final int ONE = 1;
    
    /** Number 2 to use for rows and columns. */
    private static final int TWO = 2;
    
    /** Number 3 to use for rows and columns. */
    private static final int THREE = 3;
    
    /**
     * Drives the program.
     * 
     * @param args
     *          unused
     */
    public static void main(String[] args) {
                
        int size0 = ZERO;
        int size1 = ONE;
        int size2 = TWO;
        int size3 = THREE;
        
        int value = 2;
        
        Matrix matrix1 = new Matrix(size2, size2);
        
        matrix1.setValue(value++, size0, size0);
        matrix1.setValue(value++, size0, size1);
        matrix1.setValue(value++, size1, size0);
        matrix1.setValue(value, size1, size1);
        
        Matrix matrix2 = new Matrix(size2, size2);
        
        value = 1;
        
        matrix2.setValue(value++, size0, size0);
        matrix2.setValue(value++, size0, size1);
        matrix2.setValue(value++, size1, size0);
        matrix2.setValue(value, size1, size1);
        
        System.out.println(matrix1.toString());
        System.out.println(matrix2.toString());
        
        Matrix matrix3 = new Matrix(size2, size2);
        matrix3 = matrix1.add(matrix2);
        System.out.println(matrix3);
        
        value = 1;
        
        Matrix matrix4 = new Matrix(size2, size3);
        matrix4.setValue(value++, size0, size0);
        matrix4.setValue(value++, size0, size1);
        matrix4.setValue(value++, size0, size2);
        matrix4.setValue(value++, size1, size0);
        matrix4.setValue(value++, size1, size1);
        matrix4.setValue(value, size1, size2);
        
        System.out.println(matrix4.add(matrix1).toString());
    }

}
