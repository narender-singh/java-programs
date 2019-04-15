import java.util.function.Consumer;

class Parent{
    Parent(Consumer<String> s)
    {
        s.accept("parent");
    }
}
