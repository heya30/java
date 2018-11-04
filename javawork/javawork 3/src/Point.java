
public abstract class Point {
    public int px; // position in x
    public int py; // position in y

    protected  int greyscale;

    /*
     * Return the euclidean distance between this point
     * and another point p
     * @param p another point
     * @return the euclidean distance
     */
    public abstract double getDistance(Point p);

    /*
     * Return the difference in grayscale between this point
     * and another point p
     * @param p another point
     * @return the grayscale difference
     */
    public abstract int grayscaleDiff(Point p);



}
