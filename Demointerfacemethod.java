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

}

class Demointerfacemethod
{
    public static void main(String A[])
    {
        Marvellous mobj =new Marvellous();
    }
}