/**
 This class creates a Triangle object
	@author Jennifer Spicer
	@version 1.0
*/

public class Triangle extends Shape
{
	private double height, base;
	private Point2D p1, p2, p3;

	/**
	 default constructor that creates a Triangle objects
	 with the points (0.0, 0.1), (0.2, 0.3), and (0.4, 0.5)
	 */
	public Triangle(){
		Point2D p1 = new Point2D(0.0, 0.1);
		Point2D p2 = new Point2D(0.2, 0.3);
		Point2D p3 = new Point2D(0.4, 0.5);
	}


	/**
	 overloaded constructor that creates a Triangle objects
	 with the Point2D objects passed in
	 */
	public Triangle(Point2D p1, Point2D p2, Point2D p3){
		super(p1, p2, p3);
	}


	/**
	 overriden method from the Shape class that returns the area
	 of a given Triangle object

	 @return the area of a Triangle object
	 */
	public double getArea(){
		// formula: A = (1/2)B * H
		double base = this.getBase();
		double height = this.getHeight();
		double area = (base/2) * height;
		return area;
	}


	/**
	 overriden method from the Shape class that returns the perimeter
	 of a given Triangle object

	 @return the perimeter of a Triangle object
	*/
	@Override
	public double getPerimeter(){
		// formula: P = A + B + C
		Point2D[] vertices = this.getVertices();
		double sideA = vertices[0].distance(vertices[1]);
		double sideB = vertices[1].distance(vertices[2]);
		double sideC = vertices[2].distance(vertices[0]);

		double perimeter = sideA +sideB + sideC;
		return perimeter;
	}


	/**
	 @return the x value of a Triangle object that represents height
	*/
	public double getHeight(){
		Point2D[] vertices = this.getVertices();
		double max_y = 0.0;

		for(int i=0; i<vertices.length;i++){
			// find max y value:
			if(vertices[i].getY() > max_y){
				max_y = vertices[i].getY();
			}
		}
		return max_y;
	}


}//end class
