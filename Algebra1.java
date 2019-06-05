public class Algebra1{

    public static void main(String[] args){


    float x, y, z1,z2,z3,z4; 


    x = Float.parseFloat(args[0]);
    y = Float.parseFloat(args[1]);


    z1=x+y;
    z2=x-y;
    z3=x*y;
    z4=x/y;

   
    System.out.printf("Sum is : = %20.4f\n", z1);
    System.out.printf("Diff is : = %20.4f\n", z2);
    System.out.printf("Multi is : = %20.4f\n", z3);
    System.out.printf("Div is : = %20.4f\n", z4);

  }

}
