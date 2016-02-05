/**
 * Matrix class
 */
public class Matrix {

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

    }

    /**
     *
     * @param m
     * @param n
     * @param s
     */
    public Matrix(int m, int n, double s) {

    }

    /**
     *
     * @param A
     */
    public Matrix(double[][] A) {

    }

    /**
     *
     * @param A
     * @param m
     * @param n
     */
    public Matrix(double[][] A, int m, int n) {

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
        return 0;
    }

    /**
     *
     * @return
     */
    public int getColumnDimension() {
        return 0;
    }

    /**
     *
     * @param i
     * @param j
     * @return
     */
    public double get(int i, int j) {
        return 0.0;
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
        return null;
    }

    /**
     *
     * @param i0
     * @param i1
     * @param c
     * @return
     */
    public Matrix getMatrix(int i0, int i1, int[] c) {
        return null;
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
    public void setMatrix(int i0, int i1, int j0, int j1, Matrix X) {

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
    public double normF() {
        return 0.0;
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
    public Matrix plus(Matrix B) {
        return null;
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
    public Matrix minusEquals(Matrix B) {
        return null;
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
    public Matrix times(Matrix B) {
        return null;
    }

    /**
     *
     * @return
     */
    public double trace() {
        return 0.0;
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
    public static Matrix identity(int m, int n) {
        return null;
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