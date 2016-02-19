import java.util.Random;

/**
 * Matrix class
 * Team SASS
 * Scott Shuffler, Zach Andrews, Chris Smith, Devin Sink
 * 2.5.2016
 */
public class Matrix {

	private double[][] matrix;
    public static void main(String[] args) {
        System.out.println("Hello");
    }

    /**
     * Constructors
     */

    /**
     * @chrissmith
     * Constructor that initializes an m*n matrix with all 0's.
     * @param m number of rows
     * @param n number of columns
     */
    public Matrix(int m, int n) {
    	matrix = new double[m][n];
    	for(int i = 0; i < m; i++)
    	{
    		for(int j = 0; j < n; j++)
    		{
    			matrix[i][j] = 0;
    		}
    	}
    }

    /**
    *
    * @param m
    * @param n
    * @param s
    */
   public Matrix(int m, int n, double s) {
   	matrix = new double[m][n];
   	for(int i = 0; i < m; i++)
   	{
   		for(int j = 0; j < n; j++)
   		{
   			matrix[i][j] = s;
   		}
   	}
   }

   /**
    *
    * @param A
    */
   public Matrix(double[][] A) {
   	int n = A.length;
   	int m = A[0].length;
   	matrix = new double[m][n];
   	for(int i = 0; i < m; i++)
   	{
   		for(int j = 0; j < n; j++)
   		{
   			matrix[i][j] = A[i][j];
   		}
   	}
   	
   }

    /**
     * @scottshuffler
     * @param A
     * @param m
     * @param n
     */
    public Matrix(double[][] A, int m, int n) {
        //starting
    }

    /**
     *
     * @param vals
     * @param m
     */
    public Matrix(double[] vals, int m) {

    }

    /**
     * Functions
     */

    /**
     *
     * @param A
     * @return
     */
    public static Matrix constructWithCopy(double[][] A) {
        return null;
    }

    /**
     * @chrissmith
     * Function that returns a new Matrix object with a copy of
     * the matrix field
     * @return new Matrix object with a copy of the 2D array
     */
    public Matrix copy() {
        return new Matrix(getArrayCopy());
    }

    /**
     *
     * @return
     */
    public java.lang.Object clone() {
        return null;
    }

    /**
     *
     * @return
     */
    public double[][] getArray() {
        return null;
    }

    /**
     *
     * @return
     */
    public double[][] getArrayCopy() {
        return null;
    }

    /**
     *
     * @return
     */
    public double[] getColumnPackedCopy() {
        return null;
    }

    /**
     *
     * @return
     */
    public double[] getRowPackedCopy() {
        return null;
    }

    /**
     * @chrissmith
     * Function that gets the number of rows in the matrix.
     * @return the number of rows
     */
    public int getRowDimension() {
        return matrix.length;
    }

    /**
     *
     * @return
     */
    //do this
    public int getColumnDimension() {
        return matrix.length;
    }

    /**
     *
     * @param i
     * @param j
     * @return
     */
    //do this
    public double get(int i, int j) {
        return matrix[i][j];
    }

    /**
     *
     * @param i0
     * @param i1
     * @param j0
     * @param j1
     * @return
     */
    public Matrix getMatrix(int i0, int i1, int j0, int j1) {
        return null;
    }

    /**
     * @chrissmith
     * Function that gets a submatrix of the current matrix.
     * @param r number of rows in array form
     * @param c number of columns in array form
     * @return returns a submatrix of the current matrix
     */ 
    public Matrix getMatrix(int[] r, int[] c) {
    	double[][] submatrix = new double[r.length][c.length];
        for(int i = 0; i < r.length; i++)
        {
        	for(int j = 0; j < c.length; j++)
        	{
        		submatrix[i][j] = matrix[r[i]][c[j]];
        	}
        }
    	return new Matrix(submatrix);
    }

    /**
     * @chrissmith
     * Function that gets all columns from row i0 to row i1.
     * @param i0 first row index desired
     * @param i1 last row index desired
     * @param c the columns desired
     * @return a submatrix of the current matrix
     */
    public Matrix getMatrix(int i0, int i1, int[] c) {
        double[][] submatrix = new double[i1-i0][c.length];
        for(int i = i0; i <= i1; i++)
        {
        	for(int j = 0; j < c.length; j++)
        	{
        		submatrix[i][j] = matrix[i0 + i][c[j]];
        	}
        }
    	return new Matrix(submatrix);
    }

    /**
     *
     * @param r
     * @param j0
     * @param j1
     * @return
     */
    public Matrix getMatrix(int[] r, int j0, int j1) {
        return null;
    }

    /**
     * @chrissmith
     * Function that sets a single element in the matrix
     * @param i row index
     * @param j column index
     * @param s new item in matrix
     */
    public void set(int i, int j, double s) {
    	matrix[i][j] = s;
    }

    /**
     * @chrissmith
     * Function that sets the matrix field to the one in X.
     * @param i0 first row index
     * @param i1 last row index
     * @param j0 first column index
     * @param j1 last column index
     * @param X Matrix object used to set the field
     */
    //do this
    public void setMatrix(int i0, int i1, int j0, int j1, Matrix X) {
<<<<<<< HEAD
    	for(int i = i0; i < i1; i++)
    	{
    		for(int j = j0; j < j1; j++)
    		{
    			matrix[i][j] = X[i][j];
=======
    	for(int i = i0; i <= i1; i++)
    	{
    		for(int j = j0; j <= j1; j++)
    		{
    			matrix[i][j] = X.matrix[i][j];
>>>>>>> refs/remotes/CompassSoftware/master
    		}
    	}
    }

    /**
     *
     * @param r
     * @param c
     * @param X
     */
    public void setMatrix(int[] r, int[] c, Matrix X) {

    }

    /**
     *
     * @param r
     * @param j0
     * @param j1
     * @param X
     */
    public void setMatrix(int[] r, int j0, int j1, Matrix X) {

    }

    /**
     *
     * @param i0
     * @param i1
     * @param c
     * @param X
     */
    public void setMatrix(int i0, int i1, int[] c, Matrix X) {

    }

    /**
     *
     * @return
     */
    public Matrix transpose() {
        return null;
    }

    /**
     *
     * @return
     */
    public double norm1() {
        return 0.0;
    }

    /**
     *
     * @return
     */
    public double normInf() {
        return 0.0;
    }

    /**
     *
     * @return
     */
    //do this
    public double normF() {
    	double sum = 0.0;
    	for(int i = 0; i < matrix.length; i++)
    	{
    		for(int j = 0; j < matrix[i].length; j++)
    		{
    			sum += (matrix[i][j] * matrix[i][j]);
    		}
    	}
        return Math.sqrt(sum);
    }

    /**
     * @chrissmith
     * Function that negates each element.
     * @return Matrix that is the reverse-signed version of the original
     */
    public Matrix uminus() {
    	double[][] newMatrix = new double[getRowDimension()][getColumnDimension()];
    	for(int i = 0; i < newMatrix.length; i++)
    	{
    		for(int j = 0; j < newMatrix[i].length; j++)
    		{
    			newMatrix[i][j] = -matrix[i][j];
    		}
    	}
    	return new Matrix(newMatrix);
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix plus(Matrix B) {
    	Matrix newMatrix = new Matrix(B.length, B[0].length);
        for (int i = 0; i < B.length; i++)
        {
        	for(int j = 0; j < B[i].length; j++)
        	{
        		newMatrix[i][j] = (matrix[i][j] + B[i][j]);
        	}
        }
        return newMatrix;
    }

    /**
     *
     * @param B
     * @return
     */
    public Matrix plusEquals(Matrix B) {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    public Matrix minus(Matrix B) {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix minusEquals(Matrix B) {
        for(int i = 0; i < B.length; i++)
        {
        	for(int j = 0; j < B[i].length; j++)
        	{
        		matrix[i][j] -= B[i][j];
        	}
        }
    	return matrix;
    }

    /**
     * @chrissmith
     * Function that multiplies the current matrix with the parameter B.
     * This multiplication is element-by-element.
     * @param B Matrix that is used to multiply the current matrix by
     * @return new Matrix object with the resultant matrix
     */
    public Matrix arrayTimes(Matrix B) {
    	double[][] newMatrix = new double[getRowDimension()][getColumnDimension()];
    	for(int i = 0; i < newMatrix.length; i++)
    	{
    		for(int j = 0; j < newMatrix[i].length; j++)
    		{
    			newMatrix[i][j] = matrix[i][j] * B.matrix[i][j];
    		}
    	}
    	return new Matrix(newMatrix);
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix arrayTimesEquals(Matrix B) {
    	for (int i = 0; i < B.length; i ++)
    	{
    		for(int j = 0; j < B.[i].length; j++)
    		{
    			matrix[i][j] *= B[i][j];
    		}
    	}
        return matrix;
    }

    /**
     *
     * @param B
     * @return
     */
    public Matrix arrayRightDivide(Matrix B) {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    public Matrix arrayRightDivideEquals(Matrix B) {
        return null;
    }

    /**
     * @chrissmith
     * Function that left divides the current matrix with the parameter B.
     * This division is element-by-element.
     * @param B Matrix that is used to divide the current matrix by
     * @return new Matrix object with the resultant matrix
     */
    public Matrix arrayLeftDivide(Matrix B) {
    	double[][] newMatrix = new double[getRowDimension()][getColumnDimension()];
    	for(int i = 0; i < newMatrix.length; i++)
    	{
    		for(int j = 0; j < newMatrix[i].length; j++)
    		{
    			newMatrix[i][j] = B.matrix[i][j] / matrix[i][j];
    		}
    	}
    	return new Matrix(newMatrix);
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix arrayLeftDivideEquals(Matrix B) {
    	for (int i = 0; i < B.length; i++)
    	{
    		for(int j = 0; j < B.[i].length; j++)
    		{
    			matrix[i][j] \= B[i][j];
    		}
    	}
        return matrix;
    }

    /**
     *
     * @param s
     * @return
     */
    public Matrix times(double s) {
        return null;
    }

    /**
     *
     * @param s
     * @return
     */
    public Matrix timesEquals(double s) {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix times(Matrix B) {
    	//columns of first match rows of second
    	//matrix[0].length = B.length
    	if(matrix[0].length == B.length)
    	{
    		Matrix newMatrix = new Matrix(matrix.length, B[0].length);
    		for(int i = 0; i < matrix.length; i++)
    		{
    			for(int j = 0; j < B[i].length; j++)
    			{
    				for(int k = 0; k < B.length; k++)
    				{
    					newMatrix[i][k] += matrix[i][k] * B[k][j];
    				}
    			}
    		}
    	}
    	return newMatrix;
    }

    /**
     *
     * @return
     */
    //do this
    public double trace() {
    	double diagonal;
    	for(int i = 0; i < matrix.length; i++)
    	{
    		for(int j = 0; j < matrix[i].length; j++)
    		{
    			if(i == j)
    			{
    				diagonal += matrix[i][j];
    			}
    		}
    	}
        return diagonal;
    }

    /**
     * @chrissmith
     * Function that generates a Matrix full of uniformly
     * generated doubles.
     * @param m number of rows
     * @param n number of columns
     * @return Matrix object that contains uniformly distributed data
     */
    public static Matrix random(int m, int n) {
    	double[][] rMatrix = new double[m][n];
    	Random r = new Random();
    	for(int i = 0; i < m; i++)
    	{
    		for(int j = 0; j < n; j++)
    		{
    			rMatrix[i][j] = r.nextDouble();
    		}
    	}
    	return new Matrix(rMatrix);
    }

    /**
     *
     * @param m
     * @param n
     * @return
     */
    //do this
    public static Matrix identity(int m, int n) {
    	double[][] temp = new double[m][n];
    	for(int i = 0; i < temp.length; i ++)
    	{
    		for(j = 0; j < temp[i].length; j++)
    		{
    			if(i == j)
    			{
    				temp[i][j] = 1;
    			}
    			else
    			{
    				temp[i][j] = 0;
    			}
    		}
    	}
    	Matrix identity = new Matrix(temp);
        return identity;
    }

    /**
     * @chrissmith
     * Function that prints out each item in the form x.y,
     * where w is the max number of digits in x and
     * d is the max number of digits in y.
     * @param w number of sig. digits before the decimal place
     * @param d number of sig. digits after the decimal place
     */
    public void print(int w, int d) {
    	for(int i = 0; i < getRowDimension(); i++)
    	{
    		System.out.print("[ ");
    		for(int j = 0; j < getColumnDimension(); j++)
    		{
    			System.out.print(String.format("%w.df ", matrix[i][j]));
    		}
    		System.out.println("]");
    	}
    }

    /**
     *
     * @param output
     * @param w
     * @param d
     */
    public void print(java.io.PrintWriter output, int w, int d) {
    	for(int i = 0; i < getRowDimension(); i++)
    	{
    		output.print("[ ");
    		for(int j = 0; j < getColumnDimension(); j++)
    		{
    			output.print(String.format("%w.df ", matrix[i][j]));
    		}
    		output.println("]");
    	}
    }

    /**
     *
     * @param format
     * @param width
     */
    public void print(java.text.NumberFormat format, int width) {

    }

    /**
     *
     * @param output
     * @param format
     * @param width
     */
    public void print(java.io.PrintWriter output, java.text.NumberFormat format, int width) {

    }

    /**
     *
     * @param input
     * @return
     * @throws java.io.IOException
     */
    public static Matrix read(java.io.BufferedReader input) throws java.io.IOException {
        return null;
    }
}