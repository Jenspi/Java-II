import static org.junit.Assert.*;
import org.junit.*;

public class ShapeTests{

	// declare objects and their points
	private static Rectangle rectangle;
	private static Triangle triangle;
	private static Point2D p1, p2, p3, p4;
	private static Point2D p5, p6, p7;


	// RECTANGLE TESTS:
	@BeforeClass
	public static void setupRectangle(){
		p1 = new Point2D(5.0, 3.0);
		p2 = new Point2D(5.0, 0.0);
		p3 = new Point2D(0.0, 0.0);
		p4 = new Point2D(0.0, 3.0);
		rectangle = new Rectangle(p1, p2, p3, p4);
	}

	// check to make sure object being created is correct
	@Test
    public void testRectangleIntialState(){
        assertEquals(5.0, p1.getX(), 0.0);
        assertEquals(3.0, p1.getY(), 0.0);

        assertEquals(5.0, p2.getX(), 0.0);
        assertEquals(0.0, p2.getY(), 0.0);

        assertEquals(0.0, p3.getX(), 0.0);
        assertEquals(0.0, p3.getY(), 0.0);

        assertEquals(0.0, p4.getX(), 0.0);
        assertEquals(3.0, p4.getY(), 0.0);
    }

    // test getArea() rectangle method
	@Test
	public void getRectangleAreaTest(){
		double area = rectangle.getArea();
		assertEquals(15.0, area, 0.001);
	}

	// test getPerimeter() rectangle method
	@Test
	public void getRectanglePerimeterTest(){
		double perimeter = rectangle.getPerimeter();
		assertEquals(16.0, perimeter, 0.001);
	}

	// test getHeight() rectangle method
	@Test
	public void getRectangleHeightTest(){
		double height = rectangle.getHeight();
		assertEquals(3.0, height, 0.01);
	}

	// test getBase() rectangle method
	@Test
	public void getRectangleBaseTest(){
		double base = rectangle.getBase();
		assertEquals(5.0, base, 0.01);
	}
	
	// TRIANGLE TESTS:
	@BeforeClass
	public static void setupTriangle(){
		p5 = new Point2D(2.5, 2.5);
		p6 = new Point2D(5.0, 0.0);
		p7 = new Point2D(0.0, 0.0);
		triangle = new Triangle(p5, p6, p7);
	}

	// check to make sure object being created is correct:
	@Test
    public void testTriangleIntialState(){
        assertEquals(2.5, p5.getX(), 0.0);
        assertEquals(2.5, p5.getY(), 0.0);

        assertEquals(5.0, p6.getX(), 0.0);
        assertEquals(0.0, p6.getY(), 0.0);

        assertEquals(0.0, p7.getX(), 0.0);
        assertEquals(0.0, p7.getY(), 0.0);
    }

    // test getArea() triangle method
	@Test
	public void getTriangleAreaTest(){
		double area = triangle.getArea();
		assertEquals(6.25, area, 0.001);
	}

	// test getPerimeter() triangle method
	@Test
	public void getTrianglePerimeterTest(){
		double perimeter = triangle.getPerimeter();
		assertEquals(12.071, perimeter, 0.001);
	}

	// test getHeight() triangle method
	@Test
	public void getTriangleHeightTest(){
		double height = triangle.getHeight();
		assertEquals(2.5, height, 0.01);
	}

	// test getBase() triangle method
	@Test
	public void getTriangleBaseTest(){
		double base = triangle.getBase();
		assertEquals(5.0, base, 0.01);
	}
}//end class
