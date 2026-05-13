 interface circle
{
    //Characterstics
    float PI = 3.14f;                       //public static final

}



class Demointerface
{
    public static void main(String A[])
    {
        System.out.println(circle.PI);
        circle.PI = 7.12f;                   //Erro due to final
    }
}