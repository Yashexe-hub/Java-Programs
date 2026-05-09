import java.util.Scanner;
class Dynamicmemory

{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int size = 0;

        System.out.println("Enter no of elements : ");
        size = sobj.nextInt();

        //Dyanmic memory allocation

        Float marks[] = new Float[size];

        //Use the memory
        marks = null;

        System.gc();

    }
}