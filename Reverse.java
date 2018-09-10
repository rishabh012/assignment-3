import java.util.Scanner;

public class Reverse
{

public static void main(String[] x)

{
Scanner i=new Scanner(System.in);

int num,a,sum=0,rev;

System.out.println("input num");
num=i.nextInt();
a=num;
while(num!=0)
{
rev=num%10;
sum=sum*10+rev;
num=num/10;
}
System.out.println(sum);
}}