import java.util.Scanner;
class Reference
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name :");
String Name=sc.nextLine();
System.out.println("My name:" + Name);
System.out.println("Enter your initial:");
String Initial=sc.next();
System.out.println("My initial:"+Initial);
System.out.println("Enter your Department:");
String Dept=sc.next();
System.out.println("My Department:"+Dept);
System.out.println("Enter your Age:");
int Age=sc.nextInt();
System.out.println("My Age:"+Age);
System.out.println("Enter your Cgpa:");
float Cgpa=sc.nextFloat();
System.out.println("My Cgpa:"+Cgpa);
sc.nextLine();
sc.close();
}
}