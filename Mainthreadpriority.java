class Mainthreadpriority
{
    public static void main(String A[])
    {
        System.out.println("Inside main method");

        Thread tobj = Thread.currentThread();

        String name = tobj.getName();

        System.out.println("Name of current name : " +name);

        System.out.println("Priority of thread is : " +tobj.getPriority());

    }
}