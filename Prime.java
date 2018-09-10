import java.util.Scanner;
public class Prime
{
public static void main(String[] x)

{
Scanner a=new Scanner(System.in);

    int num, j, flag;
 
    System.out.println("input num");
    num=a.nextInt();
 
    if (num <= 1)
    {
        
        System.out.println("it is not prime");
    }
    flag = 0;
    for (j = 2; j <= num / 2; j++)
    {
        if ((num % j) == 0)
        {
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
            System.out.println("it is  prime");
        
     }else
      {          System.out.println("it is not prime");
}

}
}