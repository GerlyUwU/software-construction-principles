public abstract class Figure {

    protected int numberOfSizes;
    protected double area;
    protected double perimeter;
    protected double width;
    protected double height;

    public Figure(int numberOfSizes) {
        this.numberOfSizes = numberOfSizes;
    }

    public int getNumberOfSizes() {
        return numberOfSizes;
    }

    public void setNumberOfSizes(int numberOfSizes) {
        this.numberOfSizes = numberOfSizes;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double weidth) {
        this.width = weidth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // abstract methods
    abstract double getArea();

    abstract double getPerimeter();

}