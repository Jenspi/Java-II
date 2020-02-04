import java.util.Observable;
import java.util.Observer;

public class RegularShapeMonitor implements Observer{

	@Override
	public void update(Observable arg0, Object arg1) {
		//#TODO; hint, you don't need to do anything with arg1
        // we need to make a regular shape variable and cast arg0 as a regularshape and assign it to that variable
        RegularShape shape = (RegularShape) arg0;
        
        //we need to make sure that if the shape's edge length is 0, then we report "Warning! Your shape has edges of length 0!"
		if(shape.getEdgeLength() == 0){
			System.out.println("Warning! Your shape has edges of length 0!");
		}

        //else we print out ""Length of edges has changed. Recalculating Area.""
        else{
        	System.out.println("Length of edges has changed. Recalculating Area.");
        }

        //when that is all done, we have the shape calculate it's new area
        shape.calculateArea();

        //we print out "New Area: " + shape.getArea()
        System.out.println("New Area: " + shape.getArea());
	}
}
