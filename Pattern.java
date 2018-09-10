import java.util.Scanner;
public class Pattern
{
public static void main(String[] x)
{
Scanner i=new Scanner(System.in);
int a;
int b;
System.out.println("input n");
int n;
n=i.nextInt();
for(a=0;a<n;a++)
{
for(b=0;b<a;b++)
{
System.out.print("*");
}
System.out.print("\n");

}
}

}