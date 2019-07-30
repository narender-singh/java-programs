import java.util.Map;
import java.util.LinkedHashMap;

class LRUUsingLinkedHashmap{
    private static Map<String,String> cache = new LinkedHashMap<>();

    public static void main(String[] args){
        getFromCache("P1");
        printCache();
        getFromCache("P2");
        printCache();
        getFromCache("P3");
        printCache();
        getFromCache("P4");
        printCache();
        getFromCache("P5");
        printCache();
        getFromCache("P1");
        printCache();
        getFromCache("P8");
        printCache();
        getFromCache("P1");
        printCache();
        getFromCache("P1");
        printCache();
        getFromCache("P1");
        printCache();
    }

    private static void printCache(){
        cache.entrySet().forEach(e -> System.out.print(e.getValue()+ " "));
        System.out.println(System.lineSeparator());
    }



    public static String getFromCache(String current){
        if(cache.containsKey(current)){
            cache.remove(current);
            cache.put(current,current);
            return cache.get(current);
        }else{
            addToCache(current);
            return current;
        }
    }

    public static void addToCache(String current){
        if(cache.size() == 4){
            cache.remove(cache.entrySet().iterator().next().getKey());
        }
        cache.put(current,current);
    }
}
