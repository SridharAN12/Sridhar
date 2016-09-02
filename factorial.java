import java.util.Scanner;
class factorial
{
public static void main(String args[])
{
int num,i,fact=1;
Scanner in=new Scanner(System.in);
System.out.println("enter the number");
num=in.nextInt();
for(i=num;i>0;i--)
{
fact=fact*i;
}
System.out.println("the no "+num+"is" +fact);
}
}