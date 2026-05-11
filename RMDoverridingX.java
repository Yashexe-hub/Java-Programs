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

class RMDoverridingX
{
    public static void main(String A[])
    {

        Base bobj = new Derived();      //up casting

        bobj.fun();              //Base fun
        bobj.gun();              //Derived gun
        bobj.sun();              //Derived sun
        

       

    }
}