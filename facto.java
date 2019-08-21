import java.util.*;
public class facto
{
    public static void main(String args[])
    {
        int x;
        int fact=1;
        System.out.println("Enter a digit: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            fact*=n;
            n--;
        }
        System.out.println("Factorial: "+fact);

    }
}