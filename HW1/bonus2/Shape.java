/**
 This class creates a Shape object.
	@author Jennifer Spicer
	@version 1.0
*/

public abstract class Shape
{
	private Point2D[] points;

	/**
     default constructor that creates a line with points (0,0) and (5,0)
    */
	public Shape(){
		Point2D p1 = new Point2D(0.0, 0.0);
		Point2D p2 = new Point2D(5.0, 0.0);
		points = new Point2D[]{p1, p2};
	}


	/**
	 overloaded constructor that takes an arbitrary number of Point2D
	 objects and creates a Shape object with them.

	 @param ...x Point2D objects to create a Shape object with
	*/
	public Shape(Point2D ...x){
		points = new Point2D[x.length];
		int counter = 0;
		// assign unknown amount of Point2D to points array:
		for(Point2D i : x){
			points[counter] = i;
			counter++;
		}
	}


	/**
	 @param index the vertex wanted
	 @return a Point2D object represtenting the requested vertex
	*/
	public Point2D getVertex(int index){
		return points[index];
	}


	/**
	 @return a Point2D array of all vertices
	*/
	public Point2D[] getVertices(){
		return points;
	}


	/**
	 @return two Point2D objects that create an edge parallel to the x-axis
	*/
	public Point2D[] xaxis_parallel(){
		// store two parallel points:
		Point2D[] parallels = new Point2D[2];
		for(int i = 0; i < points.length-1; i++){
			// if y values are roughly the same, they're parallel to the x-axis:
			if(i < points.length-1){
				if(Math.abs(points[i].getY() - points[i+1].getY()) < 0.01){
					parallels[0] = points[i];
					parallels[1] = points[i+1];
				}
			}
			else if(i==points.length-1){
				// compare last vertex with first as well:
				if(Math.abs(points[i].getY() - points[0].getY()) < 0.01){
					parallels[0] = points[i];
					parallels[1] = points[0];
				}
			}
		}//end for loop

		return parallels;
	}//end xaxis_parallel method


	/**
	 @return the base of a shape object
	*/
	public double getBase(){
		Point2D[] vertices = this.xaxis_parallel();
		return vertices[0].distance(vertices[1]);
	}


	/**
	 an abstract method that returns the area when overriden
	*/
	public abstract double getArea();


	/**
	 an abstract method that returns the perimeter when overridden
	*/
	public abstract double getPerimeter();
}//end class
