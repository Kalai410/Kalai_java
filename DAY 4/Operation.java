import java.util.Scanner;
class Operation
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a:");
int a=sc.nextInt();
System.out.println("Enter b:");
int b=sc.nextInt();
int c=a+b;
System.out.println("Addition:"+c);
int d=a-b;
System.out.println("Subraction:"+d);
int e=a*b;
System.out.println("Multiplication:"+e);
int f=a/b;
System.out.println("Division:"+f);
}
}
