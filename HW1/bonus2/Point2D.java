/**
   @author Dr. Christopher Summa
   @version 1.1
   
 */

//  parse custom tags with the following command:
//  jvadoc -tag custom.require:cm:"Precondition:"  -tag custom.ensure:cm:"Postcondition:" -Xdoclint:none  *.java


public class Point2D {

    private double[] coords;

    /**
     default constructor - this constructor calls the other one
     giving default x and y coordinates of 0.0 , 0.0

     @custom.ensure  getX() == 0.0
     @custom.ensure  getY() == 0.0 

    */
    public Point2D() {
        this(0.0,0.0);
    }

    /** 
     overloaded constructor taking two doubles as arguments for the
     x and y coordinates

     @param x The initial horizontal coordinate of this point2D
     @param y The initial vertical coordinate of this point2D

     @custom.ensure  getX() == x
     @custom.ensure  getY() == y
    */

    public Point2D(double x, double y) {
        coords = new double[2];
        coords[0] = x;
        coords[1] = y;
    }

    /** 
     @return The horizontal coordinate of this point2D
    */
    public double getX() {
        return coords[0];
    }

    /** 
     @return The vertical coordinate of this point2D
    */
    public double getY() {
        return coords[1];
    }

    /** 
     @return An array containing the x and y coordinates, in that order
    */
    public double[] getCoords() {
        return coords;
    }

    /** 
     @param newX The new horizontal coordinate of this point2D

     @custom.ensure  getX() == newX
    */
    public void setX(double newX) {
        coords[0] = newX;
    }

    /** 
     @param newY The new vertical coordinate of this point2D

     @custom.ensure  getY() == newY
    */
    public void setY(double newY) {
        coords[1] = newY;
    }

    /** 
     @param coords an array containing the new x and y coordinate of this point2D

     @custom.require coords.length == 2
     @custom.ensure  getX() == coords[0]
     @custom.ensure  getY() == coords[1]
    */
    public void setCoords(double[] coords) {
        this.coords = coords;
    }

    /** 
     @param newX The new horizontal coordinate of this point2D
     @param newY The new vertical coordinate of this point2D

     @custom.ensure  getX() == newX
     @custom.ensure  getY() == newY

    */
    public void moveTo(double x, double y) {
        this.coords[0] = x;
        this.coords[1] = y;
    }

    /** 
     @param dx how far to move this point2D horizontally
     @param dy how far to move this point2D vertically

     @custom.ensure  this.getX() == old.getX() + dx
     @custom.ensure  this.getY() == old.getY() + dy

    */
    public void moveBy(double dx, double dy) {
        this.coords[0] += dx;
        this.coords[1] += dy;
    }

    /** 
     calculates this distance from the current point to another point,
     accessed by a reference passed in to this method.

     @param other a reference to another Point2D object

     @return distance from this Point2D object to the one passed in as an argument

     @custom.ensure this.distance(Point2D other) >= 0.0

    */
    public double distance(Point2D other) {
        double dX = this.getX() - other.getX();
        double dY = this.getY() - other.getY();
        double dist = Math.sqrt( dX * dX + dY * dY );
        return dist;
    }

    /** 
     determines if two points are equal in their coordinates with a tolerance of 0.01 

     @param o a reference to another Point2D object

     @return true if the difference between the x coordinate of this point and o is less than tolerance, and the difference between the y coordinate of this point and that of o is less than the tolerance.  false otherwise.

    */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point2D) {
            Point2D other = (Point2D)o;
            if ( Math.abs (this.getY() - other.getY()) < 0.01 &&
                 Math.abs (this.getX() - other.getX()) < 0.01     )
                return true;
        }
        return false; // if the thing passed in is not a Point2D, how can they be equal?!?!?
        

    }

    /** 
     a String representation of this object

     @return  a String representing the x and y coordinates of this point

    */

    @Override
    public String toString() {
        return "x: " + coords[0] + " y: " + coords[1];
    }


} // end class
