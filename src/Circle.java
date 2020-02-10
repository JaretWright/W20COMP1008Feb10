public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius>0)
            this.radius = radius;
        else
            throw new IllegalArgumentException("radius must be greater than 0");
    }

    /**
     * This method will return the area of the circle
     */
    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public String toString()
    {
        return String.format("circle with radius %d", radius);
    }
}
