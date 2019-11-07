import java.util.ArrayList;

public class TestShapes {

    public static void main(String[] args) {

        Circle one = new Circle();
        Circle two = new Circle(5);

        Rectangle three = new Rectangle();
        Rectangle four = new Rectangle(4,5);


        //Shape five = new Shape();


        ArrayList<myShape> shapes = new ArrayList<>();
        shapes.add(one);
        shapes.add(two);
        shapes.add(three);
        shapes.add(four);
        //shapes.add(five);


        for (int i = 0; i <shapes.size() ; i++) {
           System.out.println("Area is: "+shapes.get(i).getArea());


        }
    }
}
