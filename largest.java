import java.util.Scanner;
class largest
{
public static void main(String args[])
{
int a,b,c;
Scanner in=new Scanner(System.in);
System.out.println("enter the numbers");
a=in.nextInt();
b=in.nextInt();
c=in.nextInt();
if(a>b && a>c)
System.out.println("a is greater");
if(b>a && b>c)
System.out.println("b is greater");
if(c>a && c>b)
System.out.println("c is greater");
}
}


