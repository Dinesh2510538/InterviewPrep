
class Human{
    //variables or members
    String name;
    private int id;
    int counter;
//methods
    public Human() {                  //no argument constructor OR default constructor
        String name = "aa";   //local variable
        this.name= "b";
        name="b";//reused local var ,replacing aa
        System.out.println("inside the default constructor " +this.name);
        System.out.println("name values "+name);
//    this.name="default_name";
    this.id=123;
    this.counter=0;//used in obj2 1st sout

    }
    public Human(int a,String n,int count){ // all argument constructor
        this.name=n;
        this.id=a;
        this.counter=count;
    }

public Human(int a){                                 // Required arguments constructor
    this.id=a;
    this.name="dummy";
    this.counter=10;
    }
    public void setId(int id) {
        this.id = id;
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
    public void incrementCounter(){
        this.counter++;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", counter=" + counter +
                '}'; // used in obj2 2nd sout
    }
}
    public class Main {
    public static void main(String[] args) {

    Human obj2 = new Human();
        System.out.println("obj2 value is "+obj2.toString());
    obj2.setId(4);
    obj2.name="ravi";
    obj2.counter=100;

        System.out.println("obj2 value is "+obj2.toString());
    obj2.incrementCounter();
    obj2.incrementCounter();
        obj2.incrementCounter();
        obj2.incrementCounter();

        obj2.incrementCounter();
        obj2.incrementCounter();

        System.out.println("counter of obj2 value is "+ obj2.counter);// counter 100 is increment therfore 106


        Human obj3 = new Human(101,"dinesh",10);
        Human obj4=new Human(1);
        System.out.println("obj4 counter value is "+obj4.counter);
        obj3.incrementCounter();
        obj3.incrementCounter();
        System.out.println("counter of obj3 value is "+ obj3.counter);//simlarly 10 is increment 2times so 12
    }
}