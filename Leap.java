import java.util.Scanner;
public class Leap

{
  public static void main(String[] x)
  {
Scanner a=new Scanner(System.in);
System.out.println("input");
int b;
b=a.nextInt();
if(b%4==0)
{
  if(b%100==0)
  {
    if(b%400==0)
    {
      System.out.println("yes is leap");
    }
    else
    {
      System.out.println("yes is not leap");
    }
  }
  else{
    System.out.println("yes is leap");
  }
}
else {
System.out.println("yes is not leap");
}
  }
}