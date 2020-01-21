/** 
* This class models a circle.
* @author Jennifer Spicer
* @version 1.0, 1/22/20
*/

public class Circle{

	private double diameter, circ, area, radius;

	/**
	* Constructs a circle object.
	* @param radius the circle's radius
	*/
	public Circle(double radius){
		this.radius = radius;
	}

	/**
	* This method won't show up on this javadocs page because it's private.
	*/
	private void privateMethod(){
		System.out.println("AAAAAAAA");
	}

	/**
	* Sets new circumference for this circle.
	* @param circ new circumference of this circle
	*/
	public void setCirc(double circ){
		this.circ = circ;
	}

	/**
	* Returns the circumference of this circle.
	* @return the circumference of this cicle
	*/
	public double getCirc(){
		return this.circ;
	}
}//end class
