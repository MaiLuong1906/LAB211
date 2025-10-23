package week7;

public class Cube extends ThreeDimensionalShape{
    private double edge;
    public Cube(double edge){
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return 6 * edge * edge;
    }

    @Override
    public double getVolume() {
        return edge * edge * edge;
    }

    @Override
    public String toString(){
        return String.format("Cube(3D) with edge: %.2f has Area = %.2f and Volume = %.2f", edge, getArea(), getVolume());
    }
}
