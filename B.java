public class B extends B1 {
   public void name() {
    System.out.println("hello");
   }
   public static void main(String[] args) {
    B var=new B();
    var.name();
    var.demo();
    B1  var1=var;
    var1.demo();
    var1.name();
   B2 v=var1;
   v.name();
   }
      
    
}
