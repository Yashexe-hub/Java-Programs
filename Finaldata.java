class Demo
{
    public final int i;
    public int j;

    public Demo(int a, int b)
    {
        this.i = a;
        this.j = b;

    }
}

class Finaldata
{
    public static void main(String A[])
    {
        Demo dobj = new Demo(10,20);

        dobj.i = 11;   //error
        dobj.j = 21;   //Allowed
        dobj.i++;      //error
        dobj.j++;      //Allowed



    }
}