class A {
    public A() {
    }
      public void print() {
          System.out.println("in A");
          throw new RuntimeException("Exception of A");
      }
}
class B extends A {
    @Override
    public void print() {
        try {
            super.print();
        }catch (Exception e){
            System.out.println("exception is "+e.getMessage());
        }
            System.out.println("in B");
        }

    }




public class inheritance {
    public static void main(String[] args) {
        B obj=new B();
        obj.print();
    }
}
