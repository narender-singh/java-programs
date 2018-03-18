public class InheritNestedStaticCls extends NestedStaticCls.NestedClass
{
    public void printInherited()
    {
        System.out.println("Yay !! Inherit Successful");
    }

    public static void main(String[] args)
    {
        InheritNestedStaticCls c = new InheritNestedStaticCls();
        c.print();
        c.printInherited();
    }
}
