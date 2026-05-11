class Base
{
    public int i,j;

    public void fun()
    {   System.out.println("Inside base fun");  }

    public void gun()
    {   System.out.println("Inside base gun");  }
    
    public void sun()
    {   System.out.println("Inside base sun");  }
    

}

class Derived extends Base
{
    public int x,y;

    public void gun()
    { System.out.println("Inside derived gun");}

    public void sun()
    { System.out.println("Inside derived sun");}

    public void run()
    { System.out.println("Inside derived run");}

}

class RMD
{
    public static void main(String A[])
    {
        //Base bobj = new Base();    //no casting

        Base bobj = new Derived();      //up casting

       // Derived dobj = new Derived();   //no casting

       // Derived dobj = new Base();      //down casting

    }
}