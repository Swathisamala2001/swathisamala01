package swathisamala;
import java.util.*;
import java.lang.*;
import java.io.*;
public class B {


 public static void main (String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        
             System.out.println("Quantity Purchased:");
             int QuantityPurchased=sc.nextInt();
             System.out.println("Rate per item:");
             float Rateperitem=sc.nextFloat();
             float Totalexpense=QuantityPurchased*Rateperitem;
             if(QuantityPurchased>1000)
             {
                 Totalexpense=Totalexpense-(Totalexpense/10);
                 System.out.println("Total expense:" +Totalexpense);
             }
             else
             {
                 System.out.println("Total expense:" +Totalexpense);
             }
    }
}
