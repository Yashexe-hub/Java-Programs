class Demo
{
    public int i;
    private int j;
    protected int k;

    public Demo()
    {
        i = 0;
        j = 0;
        k = 0;

    }

    public void Display()
    {
        System.out.println("value of i :" +i); // Allowed
        System.out.println("value of j :" +j); // Allowed
        System.out.println("value of k :" +k); // Allowed
    }

}
class Access
{
public static void main(String A[])
  {
    Demo dobj = new Demo();

    dobj.Display();

    System.out.println("value of i :" +dobj.i);  // Allowed
    System.out.println("value of j :" +dobj.j);  // Not Allowed
    System.out.println("value of k :" +dobj.k);  // ? (shikwaych baaki ahe)

   }
}

