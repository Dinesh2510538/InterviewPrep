package june20;
class  PersonDetails{
    public String name;
    public  int age;

    public PersonDetails(String name,int age){
        setName(name);
        setAge(age);
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }


}
public class Person {
    public static void main(String[] args) {
        PersonDetails p=new PersonDetails("Dinesh",20);
        System.out.println("Person name: "+p.getName());
        System.out.println("Age: "+p.getAge());
    }
}
