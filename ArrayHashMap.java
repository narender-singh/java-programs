import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

class ArrayHashMap
{ 
    Map<String,String[]> arrHash = new HashMap<>();

    public static void main(String... args)
    {
        List<String> result = Stream.of("java", "streams", "are", "great", "stuff")
                .filter(s -> {
                                System.out.println("filtering " + s);
                                return s.length()>=4; 
                })
            .map(s -> {
                               System.out.println("mapping " + s);
                                              return s.toUpperCase();
                })
                .limit(3)
                .map( s -> { System.out.println("mapping again " + s);
                    return s;
                })
                .collect(Collectors.toList());
                System.out.println("Result:");
                result.forEach(System.out::println);
        ArrayHashMap h = new ArrayHashMap();
        h.arrHash.put("Narender", new String[]{"",""});
    }
}
