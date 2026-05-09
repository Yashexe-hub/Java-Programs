class Base
{
    public int i;
    
    public Base(int no)
    {
        System.out.println("Inside base constructor");
        this.i = no;
      
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
        super(11);    //Explicit call to base
        System.out.println("Inside Derived Constructor");
        this.x = 21 ; 

    }

    
    public void gun()
    {
        System.out.println("Inside gun of Derived");

        System.out.println("Value of i :"+i);
        System.out.println("Value of i from base :"+super.i);
        
    }

}
class SuperdemoX
{
    public static void main(String A[])
   {

    Derived dobj = new Derived();  
    dobj.gun();
}
}
