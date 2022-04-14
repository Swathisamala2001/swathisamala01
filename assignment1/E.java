package swathisamala;
import java.util.Scanner;
public class E {
    static int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sys=new Scanner(System.in);
     System.out.println("enter a num");
     n=sys.nextInt();
     arithmetic(n);
	}
private static void arithmetic(int n) {
	if(n<=15000)
	{
		System.out.println("Mobile chosen is within the budget");
	}
	else
	{
		System.out.println("Mobile chosen is beyond the budget");
		
	}
}
}