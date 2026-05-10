import java.util.*;

class Arrayindex
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int arr[] = {11,21,51,101,111};

        System.out.println("Enter the index of the array : ");

        int index = sobj.nextInt();

        System.out.println("Element and that index is :"+arr[index]);   

        System.out.println("END OF APPLICATION");


    }
}