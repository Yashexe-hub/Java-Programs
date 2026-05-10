import java.util.*;

class Arrayindexexceptionn
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int arr[] = {11,21,51,101,111};

        System.out.println("Enter the index of the array : ");

        int index = sobj.nextInt();

        try
        {
            System.out.println("Inside try block");   
            System.out.println("Element and that index is :"+arr[index]);   
        }
        catch(ArrayIndexOutOfBoundsException aobj)
        {
            System.out.println("Exception occured : "+aobj);
        }
        

        System.out.println("END OF APPLICATION");


    }
}