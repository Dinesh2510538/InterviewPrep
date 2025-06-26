package june20;

 class Dog{

     public String name;
     public String breed;

     public Dog(String name,String breed){
         setName(name);
         setBreed(breed);
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getBreed() {
         return breed;
     }

     public void setBreed(String breed) {
         this.breed = breed;
     }
 }





public class DogDetails {
    public static void main(String[] args) {

        Dog d=new Dog("Tommy","Labrador");
        System.out.println("Dog Name: "+d.getName());
        System.out.println("Dog Breed: "+d.getBreed());
        d.setName("Rambo");
        d.setBreed("GermanShepard");
        System.out.println();
        System.out.println("Updated Dog Name: "+d.getName());
        System.out.println("Updated Dog Breed: "+d.getBreed());


    }
}
