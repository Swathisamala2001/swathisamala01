package swathisamala;

import java.util.Scanner;
public class C {
	    static int n;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Scanner sys=new Scanner(System.in);
	     System.out.println("enter a num");
	     n=sys.nextInt();
	     arithmetic(n);
		}
	private static void arithmetic(int n) {
		if(n%2!=0)
		{
			System.out.println((3*n)+1);
		}
		else {
			System.out.println(n/2);
			
		}
	}
	}