public class Square extends RegularShape{

	public Square(int edgeLength){//don't need to specify egde # b/c all rectangles have 4 edges
		super(4, edgeLength);
	}

	public void calculateArea(){
		// formula: A = L*W
		this.area = this.getEdgeLength() * this.getEdgeLength();
	}
}//end class
