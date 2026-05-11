class Demo
{
    public void fun()
    {
        System.out.println("Inside demo fun");

    }

    public final void gun()
    {
        System.out.println("Inside demo gun");
    }
    
}

class Hello extends Demo
{
    public void gun()
    {
        System.out.println("Inside hello gun");
    }
}

class Finalmethod
{
    public static void main(String A[])
    {
        Hello hobj = new Hello();

    }
}