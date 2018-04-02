import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class ConcurrentMap
{
    public static void main(String args[])
    {
        Map<String,String> map = new ConcurrentHashMap<>();
        map.put("Hello","World");
        map.put("Hello","World");
        map.put("World",null);

        for(Map.Entry<String,String> e : map.entrySet())
        {
            System.out.println("Key : " + e.getKey() + " " + " Value : " + e.getValue());
        }
    }
}
