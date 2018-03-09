import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class MapImpl
{
    public static void main(String[] args)
    {
        Map<String,String> dict = new HashMap<String,String>()
        {{
             put(null,null);
             System.out.println(isEmpty());
            }};
        dict.put("Narender","PiNT Developer");
        dict.put("Shubhra","MVC Developer");
        dict.put("Siddarth","Aricent Java Developer");
        dict.put("Vivek","Global Logic Java Developer");

        System.out.println(dict);

        System.out.println(Arrays.asList(",a,,b,,,,,,,".split(",")));
    }
}
