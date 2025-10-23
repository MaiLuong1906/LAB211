package week7;

public class Main {
    public static void main(String[] args) {
        Shape[] list = new Shape[6];
        list[0] = new Circle(3);
        list[1] = new Square(2);
        list[2] = new Triangle(2, 2, 3);
        list[3] = new Sphere(3);
        list[4] = new Cube(5);
        list[5] = new Tetrahedron(2);
        for(Shape s: list){
            System.out.println(s.toString());
        }
    }
}
