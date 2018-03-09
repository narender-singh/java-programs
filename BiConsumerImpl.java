import java.util.function.BiConsumer;


class BiConsumerImpl
{
    static <T,U> int gotIt(BiConsumer<T,U> b, T t, U u)
    {
        //b.accept(t,u);
        b.andThen(b).andThen(b).andThen(b).accept(t,u);
        return 0;
    }

    public static void main(String... args)
    {
        gotIt((l,r) -> { System.out.println(l + " " + r); },"Narender", "Singh");
    }
}
