package week7;

public class Sphere extends ThreeDimensionalShape{
    private double r;

    public Sphere(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double getVolume() {
        return (4.0/3) * Math.PI * r * r * r;
    }

    @Override
    public String toString(){
        return String.format("Sphere(3D) with radius: %.2f has Area = %.2f and Volume = %.2f", r, getArea(), getVolume());
    }
}
