/** 
* This class models a circle.
* @author Jennifer Spicer
* @version 1.0, 1/22/20
*/

public class Circle{

	private double diameter, circ, area, radius;

	/**
	* This creates a circle object.
	* @param radius This is the circle's radius.
	*/
	public Circle(double radius){
		this.radius = radius;
	}

	/**
	* This method won't show up on our javadocs page because it's private.
	*/
	private void privateMethod(){
		System.out.println("AAAAAAAA");
	}

	/**
	* This allows us to set the circumference of our circle.
	* @param circ The circumference of our circle.
	*/
	public void setCirc(double circ){
		this.circ = circ;
	}

	/**
	* This is how to get the circumference of our circle.
	* @return The circumference of our cicle.
	*/
	public double getCirc(){
		return this.circ;
	}
}//end class
