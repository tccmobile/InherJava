public class Student extends Person {
    private double gpa;

    public Student() {
        gpa = 3.0;
    }

    public Student(String name, int age, double gpa) {
        super(name, age);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void printMe() {
        super.printMe();
        System.out.println("and my gpa is: "+gpa);
    }
}
