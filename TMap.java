import java.util.*;

class TMap{
    public static void main(String... args){
        Map<TMap,TMap> tmap = new TreeMap<>((x,y) -> 0);
        TMap m = new TMap();
        tmap.put(m,m);
    }
}
