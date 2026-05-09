import java.util.Scanner;
class Dynamicmemoryio

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;
        int i = 0;

        System.out.println("Enter no of elements : ");
        size = sobj.nextInt();

        //Dyanmic memory allocation

        Float marks[] = new Float[size];

        //Use the memory
        System.out.println("Enter your marks : ");

        for(i = 0; i < size; i++)
        {
            marks[i] = sobj.nextFloat();
        }

        System.out.println("Entered marks are : ");

         for(i = 0; i < size; i++)
        {
            System.out.println(marks[i]);
        }

        marks = null;
        System.gc();

    }
}