/**
 This class creates a Rectangle object
	@author Jennifer Spicer
	@version 1.0
*/

public class Rectangle extends Shape
{
	private double height, base;
	private Point2D p1, p2, p3, p4;

	/**
	 default consturctor that creates a Rectangle with points (5.0, 3.0),
	 (5.0, 1.0), (1.0, 1.0), and (1.0, 3.0)
	*/
	public Rectangle(){
		Point2D p1 = new Point2D(5.0, 3.0);
		Point2D p2 = new Point2D(5.0, 1.0);
		Point2D p3 = new Point2D(1.0, 1.0);
		Point2D p4 = new Point2D(1.0, 3.0);
	}


	/**
	 overloaded consturctor that creates a Rectangle with the
	 points given in a clockwise manner

	 @param p1 a Point2D object that represents the first point
	 @param p2 a Point2D object that represents the second point
	 @param p3 a Point2D object that represents the third point
	 @param p4 a Point2D object that represents the fourth/last point
	*/
	public Rectangle(Point2D p1, Point2D p2, Point2D p3, Point2D p4){
		super(p1, p2, p3, p4);
	}


	/**
	 overriden method from the Shape class that returns the
	 area of a Rectangle object

	 @return the area of a rectangle
	*/
	@Override
	public double getArea(){
		// formula: A = W(L)
		double width = this.getBase();
		double length = this.getHeight();
		double area = width * length;
		return area;
	}

	
	/**
	 overriden method from the Shape class that returns the
	 perimeter of a Rectangle object

	 @return the perimeter of a rectangle
	*/
	@Override
	public double getPerimeter(){
		// formula: P = 2(L+W)
		double length = this.getHeight();
		double width = this.getBase();
		double perimeter = 2 * (length + width);
		return perimeter;
	}


	/**
	 @return the height (length) of a rectangle
	*/
	public double getHeight(){
		Point2D[] vertices = this.getVertices();
		double height = 99999999.8;//set as weird num for testing purposes

		for(int i = 0; i < vertices.length-1; i++){
			// if x values are roughly the same, they're parallel to the y-axis:
			if(i < vertices.length-1){
				if((Math.abs(vertices[i].getX() - vertices[i+1].getX()) < 0.01)){
				// get distance between the two points to use as height value
					height = vertices[i].distance(vertices[i+1]);
				}
			}
			else if(i==vertices.length-1){
				// compare last vertices with first as well:
				if((Math.abs(vertices[i].getX() - vertices[0].getX()) < 0.01)){
					height = vertices[i].distance(vertices[0]);
				}
			}
		}

		return height;
	}
}//end class
