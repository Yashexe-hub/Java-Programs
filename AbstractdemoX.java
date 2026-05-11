abstract class demo
{
    public int i,j;
    
    public int add(int a, int b)                    //concrete method
    {
        return a+b;
    }

    public abstract int sub(int a, int b);
    
}

class Hello extends Demo
{

}

class AbstractdemoX
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();
    }
}