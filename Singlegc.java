class Base
{
    public int i;
    public int j;

    public Base()
    {
        System.out.println("Inside base constructor");
        this.i = 0;
        this.j = 0;


    }

    protected void finalize()
    {
        System.out.println("Inside finalize method of base");
    }

    public void fun()
    {
        System.out.println("Inside base fun");

    }
}

class Derived extends Base
{
    public int x;
    
    public Derived()
    {
        System.out.println("Inside Derived Constructor");
        this.x = 0;

    }

    protected void finalize()
    {
        System.out.println("Inside finalize method of base");
    }

    public void gun()
    {
        System.out.println("Inside gun of Derived");
    }

}
class Singlegc
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");

        Derived dobj = new Derived();
        
        System.out.println(dobj.i);   // 0
        System.out.println(dobj.j);   // 0
        System.out.println(dobj.x);   // 0

        dobj.fun();
        dobj.gun();

        dobj = null;

        System.gc();

        System.out.println("End of main");
    }
}