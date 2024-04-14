import java.util.Scanner;
class Chocolate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter an age :");
int age=sc.nextInt();
if(age<=15)
{
System.out.println("Give Chocolate");
}
else
{
System.out.println("Guide");
}
System.out.println("bye");
}
}