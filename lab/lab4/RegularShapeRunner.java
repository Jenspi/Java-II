import java.util.ArrayList;

public class RegularShapeRunner {

	public static void main(String[] args) {
		
		RegularShape triangle = new Triangle (5);
		RegularShape square = new Square(5);
		ArrayList<RegularShape> shapes = new ArrayList<RegularShape>();
		shapes.add(triangle); shapes.add(square);
		
		//Display the properties of all test shapes.
		for (RegularShape testRegularShape : shapes) {
			System.out.println(testRegularShape.getAngles());
			System.out.println(testRegularShape.getArea());
		}
		
		/*#TODO*/
		//Create a RegularShapeMonitor object
		RegularShapeMonitor monitor = new RegularShapeMonitor();
		
		//add it to all shape objects (triangle and square)
		for(RegularShape s : shapes){
			s.addObserver(monitor);
		}
		
		triangle.setEdgeLength(0);
		square.setEdgeLength(10);
	}
}//end class
