public class Rectangle implements myShape {
    private double height;
    private double width;

    public Rectangle() {
        height =1.0;
        width = 2.0;
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

 @Override
    public double getArea() {
        return height*width;
    }
}
