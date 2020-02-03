/**
 This class creates a Circle object
	@author Jennifer Spicer
	@version 1.0
*/

public class Circle extends Shape
{
	private double diameter, circumference, area, radius;
	private Point2D p1;

	/**
	 default consturctor that creates a Circle object with
	 the point (5.0, 5.0) as its center, and a radius of 2.0
	*/
	public Circle(){
		this.p1 = new Point2D(5.0, 5.0);
		this.diameter = 2.0;
	}


	/**
	 overriden constructor creates a Circle object
	 @param radius the circle's radius
	*/
	public Circle(Point2D p1, double diameter){
		this.p1 = p1;
		this.diameter = diameter;
	}


	/**
	 @return the circumference of a Circle object
	*/
	public double getCircumference(){
		// formula: C = 2 * pi * r
		radius = this.getRadius();
		circumference = (2 * Math.PI) * radius;
		return this.circumference;
	}


	/**
	 @return the radius of a Circle object
	*/
	public double getRadius(){
		this.radius = diameter/2.0;
		return this.radius;
	}


	/**
	 @return the diameter of a Circle object
	*/
	public double getDiameter(){
		return this.diameter;
	}

	/**
	 @return the area of a Circle object
	*/
	public double getArea(){
		// formula: A = pi * r^2
		this.area = Math.PI * (radius * radius);
		return this.area;
	}


	/**
	 sets the center point of a Circle object
	*/
	public void setCenter(Point2D p1){
		this.p1 = p1;
	}


	/**
	 sets the diameter of a Circle object
	*/
	public void setDiameter(double diameter){
		this.diameter = diameter;
	}

	public double getPerimeter(){
		return this.getCircumference();
	}

}//end class
