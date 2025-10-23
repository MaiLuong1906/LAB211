package week7;

public class Circle extends TwoDimensionalShape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString(){
        return String.format("Circle(2D) with radius: %.2f has area = %.2f", radius, getArea());
    }
}
