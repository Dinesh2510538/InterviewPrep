class Employee {

     static int Counter = 1;
     int id;
     String name;
     int age;


    public Employee(String n, int a) {  //required constructor
        this.id = Counter++;
        this.name = n;
        this.age = a;
    }


    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }



}

public class Id {
    public static void main(String[] args) {


                Employee emp1 = new Employee("Ravi",58);
                Employee emp2 = new Employee("Ragav", 27);
                Employee emp3 = new Employee("Dinesh", 20);

                System.out.println("ID: " + emp1.getId() + ", Name: " + emp1.getName()+", Age: " +emp1.getAge());
                System.out.println("ID: " + emp2.getId() + ", Name: " + emp2.getName()+", Age: " +emp2.getAge());
                System.out.println("ID: " + emp3.getId() + ", Name: " + emp3.getName()+", Age: " +emp3.getAge());






    }
}
