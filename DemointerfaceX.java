 interface circle
{
    //Characterstics
    float PI = 3.14f;                       //(public static final)

    //Behaviours                            //(public abstract)
    float Area(float radius);

    float circumferance(float radius);

}

class Marvellous implements circle               //Error due to missing body of area and circumferance
{
    public float Area(float radius)
     {
        return circle.PI * radius * radius;
     }

    public float circumferance(float radius)
    {
        return 2 * circle.PI * radius;
    }
}

class DemointerfaceX
{
    public static void main(String A[])
    {
        circle cobj = new circle();
        Marvellous mobj = new Marvellous();

        float ret = 0.0f;

        ret = mobj.Area (10.5f); 
        System.out.println("Area is : "+ret);

        ret = mobj.circumferance(10.5f);
        System.out.println("Circumferance is : "+ret);
    }
}