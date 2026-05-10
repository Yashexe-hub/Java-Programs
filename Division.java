import java.util.*;

class Division
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Float no1 = 0.0f , no2 = 0.0f , Ans = 0.0f;

        System.out.println("Enter first no : ");
        no1 = sobj.nextFloat();

        System.out.println("Enter second no : ");
        no2 = sobj.nextFloat();

        Ans = no1 / no2;

        System.out.println("Division is :"+Ans);

    }
}