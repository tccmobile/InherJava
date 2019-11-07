import java.util.ArrayList;

public class TextInher {
    public static void main(String[] args) {
        Person one = new Person();
        Person two = new Person("bob",42);

        Student three = new Student();
        Student four = new Student("mary",32,3.5);

        one.printMe();
        two.printMe();
        three.printMe();
        four.printMe();


        ArrayList<Person> classRoom = new ArrayList<>();
        classRoom.add(one);
        classRoom.add(two);
        classRoom.add(three);
        classRoom.add(four);

        for (int i = 0; i < classRoom.size(); i++) {
            classRoom.get(i).printMe();
        }
    }
}
