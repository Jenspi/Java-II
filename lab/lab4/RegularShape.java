//#TODO import statement
import java.util.Observable;

//#TODO make sure RegularShape IS-AN Observable (ie, is a subclass of Observable)
public abstract class RegularShape extends Observable {
	
	private int edges;//Number of edges the shape has
	private int edgeLength;//Length of each edge; all edges are same length
	protected double area;//Area of the shape
	private double angles;//Size of each angle in the shape
	
	public RegularShape (int edges, int edgeLength) {
		this.edges = edges;
		this.edgeLength = edgeLength;
		if (this.edges < 3) {
			throw new IllegalArgumentException("RegularShapes must have at least 3 sides");
		}
		calculateArea();
		calculateAngles();
	}

	public int getEdges() {
		return edges;
	}

	public double getArea() {
		return area;
	}

	public double getAngles() {
		return angles;
	}
	
	public void setEdgeLength(int edgeLength) {
		this.edgeLength = edgeLength;
		//This is the method we want to monitor
		//#TODO
        //we need to set this as changed
        setChanged();
        //we need to notify observers
        notifyObservers();
		
	}
	
	public int getEdgeLength() {
		return edgeLength;
	}
	
	public abstract void calculateArea();
	
	public final void calculateAngles() {
		int totalAngles = (this.edges - 2)*180;
		this.angles = totalAngles/this.edges;
	}
	
	@Override
	public String toString() {
		return "Edges: " + this.edges + "\nEdge Length: " + this.edgeLength
				+ "\nArea: " + this.area + "\nAngles: " + this.angles;
	}

}
