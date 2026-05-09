Class ArrayDemoo
{
    public static void main(String A[])
    {
        int arr[] ={10,20,30,40};    //1

        int []brr = {50,60,70,80};   //2

        int crr[] = new int[4];      //3
        
        crr[0] = 10;
        crr[1] = 20;
        crr[2] = 30;
        crr[3] = 40;

        System.out.println(arr.length);   //4 bytes
        System.out.println(brr.length);   //4 bytes
        System.out.println(crr.length);   //4 bytes

    }
}