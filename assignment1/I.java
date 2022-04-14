package swathisamala;
import java.util.Scanner;
public class I
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("number:");
        int num=sc.nextInt();
        if(num==9 || num==10)
        {
            System.out.println("excellent");
        }
        else if(num==7 || num==8)
        {
           System.out.println("notable");
        }
        else if(num==6)
        {
           System.out.println("good");
        }
        else if(num==5)
        {
           System.out.println("improved");
        }
        else if(num==0 || num==1 || num==2 || num==3 || num==4 )
        {
           System.out.println("fail");
        }
        
        else
            {
                System.out.println("invalid");
            }
        }
    }
