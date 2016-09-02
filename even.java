import java .util.Scanner;
class even
{
public static void main(String arg[])
{
int x;
System.out.println("enter the integer");
Scanner in=new Scanner(System.in);

x=in.nextInt();
if(x%2==0) 

System.out.println("even number");
else
System.out.println("odd number");

}
}