package swathisamala;
import java.util.Scanner;
public class A {
public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
	    System.out.println("code:");
	    int code = obj.nextInt();
	    if(code==1){
	       Scanner a = new Scanner(System.in);
	        System.out.println("x:");
	        float c=a.nextFloat();
	        Scanner b = new Scanner(System.in);
	        System.out.println("y:");
	        float d=b.nextFloat();
	         float sum;
	        sum=c+d;
	        System.out.println("Sum:"+sum);
          	}
	    else{
	    System.out.println("Sum:0.00");	    
	}
	}

}