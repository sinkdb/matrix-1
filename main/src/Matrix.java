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
     *
     * @param m
     * @param n
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
     *
     * @return
     */
    public Matrix copy() {
        return null;
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
     *
     * @return
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
     *
     * @param r
     * @param c
     * @return
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
     *
     * @param i0
     * @param i1
     * @param c
     * @return
     */
    public Matrix getMatrix(int i0, int i1, int[] c) {
        double[][] submatrix = new double[c.length][i1-i0];
        for(int i = i0; i < i1; i++)
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
     *
     * @param i
     * @param j
     * @param s
     */
    public void set(int i, int j, double s) {

    }

    /**
     *
     * @param i0
     * @param i1
     * @param j0
     * @param j1
     * @param X
     */
    //do this
    public void setMatrix(int i0, int i1, int j0, int j1, Matrix X) {
    	for(int i = i0; i < i1; i++)
    	{
    		for(int j = j0; j < j1; j++)
    		{
    			matrix[i][j] = X[i][j];
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
     *
     * @return
     */
    public Matrix uminus() {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix plus(Matrix B) {
    	Matrix temp = new Matrix(B.length, B[0].length);
        for (int i = 0; i < B.length; i++)
        {
        	for(int j = 0; j < B[i].length; j++)
        	{
        		temp[i][j] = (matrix[i][j] + B[i][j]);
        	}
        }
        return temp;
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
     *
     * @param B
     * @return
     */
    public Matrix arrayTimes(Matrix B) {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix arrayTimesEquals(Matrix B) {
        return null;
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
     *
     * @param B
     * @return
     */
    public Matrix arrayLeftDivide(Matrix B) {
        return null;
    }

    /**
     *
     * @param B
     * @return
     */
    //do this
    public Matrix arrayLeftDivideEquals(Matrix B) {
        return null;
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
        for(int i = 0; i < matrix.length; i++)
        {
        	for(int j = 0; j < matrix[i].length; j++)
        	{
        		matrix[i][j] *=
        	}
        }
    	return null;
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
     *
     * @param m
     * @param n
     * @return
     */
    public static Matrix random(int m, int n) {
        return null;
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
    				temp[i[j] = 0;
    			}
    		}
    	}
    	Matrix identity = new Matrix(temp);
        return i;
    }

    /**
     *
     * @param w
     * @param d
     */
    public void print(int w, int d) {

    }

    /**
     *
     * @param output
     * @param w
     * @param d
     */
    public void print(java.io.PrintWriter output, int w, int d) {

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