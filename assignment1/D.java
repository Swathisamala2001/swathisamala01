package swathisamala;


import java.util.Scanner;
class D {
      public int teenSum(int num1, int num2) {
  int sum = num1+num2;
  if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19))
    return 19;
  else
    return sum;
  }

  public static void main(String[] args) {
    
    int a,b;
    Scanner sc=new Scanner(System.in);
    System.out.println("a:");
    a=sc.nextInt();
    System.out.println("b:");
    b=sc.nextInt();

   
    D obj = new D();

    int result = obj.teenSum(a,b);
    System.out.println("teenSum: " + result);
  }
}
