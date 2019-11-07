public class Person {
    private String name;
    private int age;

    public Person() {
        name = "none";
        age = 17;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printMe(){
        System.out.println("My name is "+name+" and I'm "+age+" years old");
    }
}
