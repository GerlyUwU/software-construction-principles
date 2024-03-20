public class Rectangle extends Figure implements ChangeDimensions {
    

    public Rectangle(int numberOfSizes, double width, double height) {
        super(numberOfSizes);  
        this.width = width;    
        this.height = height;  
    }

    @Override
    public void changeDimensions(double value) {
        // TODO Auto-generated method stub
        height *= value;
        width *= value;
      
    }

    @Override
    double getArea() {
        // TODO Auto-generated method stub
        return area = width*height;

    }

    @Override
    double getPerimeter() {
        // TODO Auto-generated method stub
        return perimeter = (width*2)+(height*2);
    }
    
}
