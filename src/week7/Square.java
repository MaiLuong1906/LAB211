package week7;

public class Square extends TwoDimensionalShape{
    private double edge;
    public Square(double edge){
        this.edge = edge;
    }
    @Override
    public double getArea() {
        return edge * edge;
    }

    @Override
    public String toString(){
        return String.format("Square(2D) with edge: %.2f has Area = %.2f", edge, getArea());
    }
}
