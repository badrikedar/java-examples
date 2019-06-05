import java.io.*;
import java.util.*;
import static java.lang.System.out;
import static java.lang.System.in;


public class Maths {

     public static void main(String[] args){

     Scanner scn = new Scanner (in) ;

     System.out.println("Give a number !"); 
     float x =  scn.nextFloat();     
     float  y  = (32.0f + (9.0f/5.0f) * x) ; 

     out.printf("C=%12.6f, F=%12.6f\n",x,y);    



   }
}
