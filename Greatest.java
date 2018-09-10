import java.util.Scanner;

public class Greatest
{

public static void main(String[] x)

{
Scanner i=new Scanner(System.in);
int a,b,c;

System.out.println("input a");
a=i.nextInt();

System.out.println("input b");
b=i.nextInt();

System.out.println("input c");
c=i.nextInt();
if(a>b && a>c)
{
System.out.println("a is greatest");
}
else if(b>a && b>c)
{
System.out.println("b is greatest");
}
else
{
System.out.println("c is greatest");
}
}}