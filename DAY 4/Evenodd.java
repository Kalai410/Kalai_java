import java.util.Scanner;
class Evenodd
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number:");
int a=sc.nextInt();
if(a%2==0)
{
System.out.println("Even number");
}
else
{
System.out.println("Odd number");
}
}
}