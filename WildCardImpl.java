import java.util.Set;
import java.util.HashSet;

class WildCardImpl
{
    public static Set<Object> unknownSet;

    static
    {
        unknownSet = new HashSet<Object>();        
    }

    public static <T>  void addToSet(Set<? super T> set,T t)
    {
        set.add(t);
    }

    public static void main(String[] args)
    {
        addToSet(unknownSet,"narender");
        System.out.println(unknownSet);
    }
}

