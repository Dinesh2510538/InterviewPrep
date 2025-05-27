class Arith {

    public int Add(int a, int b) {
        try {
            int c = a + b;
            throw new RuntimeException("runtime exception ");
        } catch (Exception e) {
            System.out.println(" something wrong"+e.getMessage());
        }
        return 0;
    }

    public int compAdd() throws RuntimeException{

        int f = Add(4,5) + Add(4,5);
        throw new RuntimeException("runtime exception compAdd");
    }

    public void comp2Add() {
//        try {
            compAdd();
//        } catch (Exception e) {
//            System.out.println("Exception handled"+e.getMessage());
//        }
    }
}
    public class exception_handling {
    public static void main(String[] args) {

       Arith obj=new Arith();
      try {
          obj.comp2Add();
      }
      catch (Exception e){
          System.out.println(e.getMessage());
      }
    }
}