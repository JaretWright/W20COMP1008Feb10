import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle shape = new Rectangle(10, 20);

    @Test
    public void getLength() {
        int expResult = 10;
        assertEquals(expResult, shape.getLength());
    }

    @Test
    public void setLength() {
        shape.setLength(40);
        assertEquals(40, shape.getLength());
    }

    @Test
    public void setLengthInvalidLow() {
        try {
            shape.setLength(0);
            fail("invalid low length SHOULD have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("low length properly caught: "+e.getMessage());
        }
    }


    @Test
    public void getWidth() {
        int expResult = 20;
        assertEquals(expResult, shape.getWidth());
    }



    @Test
    public void setWidthInvalidLow() {
        try {
            shape.setWidth(0);
            fail("invalid low width SHOULD have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("low width properly caught: "+e.getMessage());
        }
    }

    @Test
    public void setWidth() {
        shape.setWidth(50);
        assertEquals(50,shape.getWidth());
    }


    @Test
    public void getPerimeter() {
        int expResult = 10+20+10+20;
        assertEquals(expResult, shape.getPerimeter());
    }

    @Test
    public void getArea() {
        int expResult = 10*20;
        assertEquals(expResult, shape.getArea());
    }

    @Test
    public void isSquareTrue() {
        Rectangle square = new Rectangle(20,20);
        boolean expResult = true;
        assertEquals(expResult, square.isSquare());
    }

    @Test
    public void isSquareFalse() {
        Rectangle notSquare = new Rectangle(30,20);
        boolean expResult = false;
        assertEquals(expResult, notSquare.isSquare());
    }
}