public class Triangle extends Figure {



    public Triangle(int numberOfSizes, double width, double height) {
        super(numberOfSizes);  
        this.width = width;    
        this.height = height;  
    }


    
    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return area=(width*height)/2;
    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        double sizeA = Math.sqrt(height * height + (width/2)*(width/2));
        return perimeter = width + sizeA + sizeA;
    }


    
}
