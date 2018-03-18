public class SingletonLazyLoading
{
    private static final SingletonLazyLoading OBJECT = new SingletonLazyLoading();

    private SingletonLazyLoading()
    {
        System.out.println("Constructor Called");
    }

    static
    {
        System.out.println("This is Static Initializer");
    }

    private static class SingletonHandler
    {
        static 
        {
            System.out.println("This in static innner class Static initializer");
        }
        private static final SingletonLazyLoading SLL_OBJECT = new SingletonLazyLoading();
    }

    public static SingletonLazyLoading getInstance()
    {
        return SingletonHandler.SLL_OBJECT;
    }

    public static void dummy()
    {
        System.out.println("this is dummy method");
    }
}
