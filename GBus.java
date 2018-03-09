import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class GBus
{
    private static class BusRoute implements Comparable<BusRoute>
    {
        private int start;
        private int last;

        public BusRoute(int s,int l)
        {
            start = s;
            last = l;

        }

        public int getStart()
        {
            return start;
        }

        public int getLast()
        {
            return last;
        }

        @Override
        public int compareTo(BusRoute br)
        {
            if(br == null)
               throw new NullPointerException("Agrument is null");
            int res = this.start - br.start;
            if( res != 0)
                return res;
            else
                return this.last - br.last;
        }
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner input = new Scanner(new File("input.in"));
        int textCases = input.nextInt();
        List<String> list = new ArrayList<>();
        for(int j = 1; j <= textCases; j++)
        {
            int[] stops;
            int nBus = input.nextInt();
            Set<BusRoute> busSet = new TreeSet<>();
            for(int i = 0; i < nBus; i++)
            {
                busSet.add(new BusRoute(input.nextInt(),input.nextInt()));
            }        
            for(BusRoute s : busSet)
            {
                System.out.println("Start : " + s.getStart() + "  Last : " + s.getLast());
            }
            stops = new int[input.nextInt()];
            for(int i = 0; i < stops.length; i++)
            {
                stops[i] = input.nextInt();
            }
            input.nextLine();
            String res = "Case #" + j + ": " + findBuses(busSet, stops);
            list.add(res);
            System.out.println(res);
        }
        for(String s : list)
            System.out.println(s);
    }

    public static String findBuses(Set<? extends BusRoute> bSet, int[] stops)
    {
        String response = "";
        for(int i = 0; i < stops.length; i++)
        {
            int count = 0;
            for(BusRoute br : bSet)
            {
                if(br.getStart() > stops[i])
                {
                    break;
                }
                else if(br.getStart() <= stops[i] && br.getLast() >= stops[i])
                    count++;
            }
            response += count + " ";
        }        
        return response.trim();
    }
}
