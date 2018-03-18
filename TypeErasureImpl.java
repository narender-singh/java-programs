import java.util.Set;

class TypeErasureImpl
{
    public static void main(String[] args)
    {
        System.out.println("Allowed");
    }

    //Same signatures after type erasure 
    public void Set(Set<Integer> i)
    {

    }

    public void Set(Set<String> s)
    {

    }
}
