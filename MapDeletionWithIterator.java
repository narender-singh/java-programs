import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ConcurrentModificationException;

class MapDeletionWithIterator
{
    public static void main(String[] args)
    {
        Map<String,String> map = new ConcurrentHashMap<String,String>(){
            {
                put("Narender","Singh");
                put("Vivek","Verma");
                put("Shubhra","Upadhyay");
                put("Amit","Handa");
            }
        };

        Iterator<String> keyIterator = map.keySet().iterator();
        
        try
        {
            while(keyIterator.hasNext())
            {
                String val = keyIterator.next();
                if(val.equals("Narender") || val.equals("Vivek"))
                {
                    map.remove(val);
                    System.out.println("removed successfully");
                }
            }
        }
        catch(ConcurrentModificationException e)
        {
            System.out.println("Exception Occurred " + e);     
        }

        for(Map.Entry<String,String> eSet : map.entrySet())
        {
            System.out.println(eSet.getKey() + " " + eSet.getValue());
        }

    }

}
