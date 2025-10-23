package week7;

public class Triangle extends TwoDimensionalShape{
    private double a, b, c;
    private double p;
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
        p = (a+b+c)/2.0;
    }
    @Override
    public double getArea() {
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public String toString(){
        return String.format("Triangle(2D) with 3 edges %.2f, %.2f, %.2f has Area = %.2f", a, b, c, getArea());
    }
}
