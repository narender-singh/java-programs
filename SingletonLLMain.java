public class SingletonLLMain
{

    static 
    {
        System.out.println("This is main Static Initializer");
    }

    public static void main(String... args)
    {
        SingletonLazyLoading sll = null;
        SingletonLazyLoading.dummy();
        sll = SingletonLazyLoading.getInstance();
    }
}

