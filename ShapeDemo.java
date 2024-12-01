class Shape {
    public void draw() {
        System.out.println("Drawing a shape...");
    }
    public void erase() {
        System.out.println("Erasing a shape...");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing a circle...");
    }
    public void erase() {
    System.out.println("Erasing a circle...");
    }
}
    class Triangle extends Shape {
    public void draw() {
        System.out.println("Drawing a triangle...");
    }
    public void erase() {
    System.out.println("Erasing a triangle...");
    }
}
class Square extends Shape {
    public void draw() {
        System.out.println("Drawing a square...");
    }
    public void erase() {
        System.out.println("Erasing a square...");
    }
}
public class ShapeDemo {
    public static void main(String[] args) {
    Shape shape1 = new Circle();
    Shape shape2 = new Triangle();
    Shape shape3 = new Square();
    shape1.draw();
    shape1.erase();
    shape2.draw();
    shape2.erase();
    shape3.draw();
    shape3.erase();
    }
}
