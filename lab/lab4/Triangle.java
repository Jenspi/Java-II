public class Triangle extends RegularShape{
	
	public Triangle(int edgeLength){//don't need to specify egde # b/c all triangles have 3 edges
		super(3, edgeLength);
	}

	public void calculateArea(){
		// formula for equilateral triangle: A = ( (sqrt3)/4 ) * a^2
		this.area = (Math.sqrt(3)/4) * Math.pow(this.getEdgeLength(), 2);
	}
}//end class
