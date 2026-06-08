package sep17;
class PersonDetail{
    String name;
    int age;

    public PersonDetail(String name, int age) {
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
}

public class Person {
    public static void main(String[] args) {
        PersonDetail P = new PersonDetail("Dinesh",20);
        System.out.println("Name: " + P.getName());
        System.out.println("Age: " + P.getAge());
    }
}
