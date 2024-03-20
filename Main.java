public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(4, 4, 3);
        System.out.println("\n area of the rectangle: " + rectangle1.getArea());
        System.out.println("\n perimeter of the rectangle: " + rectangle1.getPerimeter() + "\n");
        rectangle1.changeDimensions(3);
        System.out.println("area of the resized rectangle: " + rectangle1.getArea());

        Triangle triangle1 = new Triangle(3, 4, 3);
        System.out.println("\n area of the triangle: " + triangle1.getArea());
        System.out.println("\n perimeter of the rectangle: " + triangle1.getPerimeter() + "\n");
        


    }
}
