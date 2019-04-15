import java.util.Set;
import java.util.List;
import java.util.LinkedList;
import java.util.HashSet;

public class Solution
{
    public static void main(String args[]){
    	List<List<Integer>> area = new LinkedList<>();
	List<Integer> data = new LinkedList<Integer>();
	data.add(1);
	data.add(0);
	data.add(0);
        area.add(data);
        data = new LinkedList<Integer>();
	data.add(1);
	data.add(0);
	data.add(0);
	area.add(data);
	data = new LinkedList<Integer>();
	data.add(1);
	data.add(9);
	data.add(1);
	area.add(data);
	Solution s = new Solution();
	System.out.println("Distance : " + s.minimumDistance(3,3,area));
    }
   
    public class Pair extends Comparable {
        public int cx,cy,px,py;
        public int cost;

        public int compareTo(Pair second)
        {
            if(cx != second.cx || px != second.px || cy != second.cy || py != second.py )
                return 1;
            return 0;
        }
        @Override
        public boolean equals(Object o){
            if(this.compareTo((Pair)o) == 0)
                return true;
            return false;
        }
    }

    public static Map<String,boolean> covered = new HashMap<>();    
    public static String current;

    public static int minimumMove = Integer.MAX_VALUE;
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    int minimumDistance(int numRows, int numColumns, List<List<Integer>> area)
    {
        return findDistance(numRows,numColumns,0,0,area,0);
    }
    
    int findDistance(int r, int c, int x, int y,List<List<Integer>> area, int move){
               
        if(area.get(x).get(y) == 0)
            return -1;
        if(area.get(x).get(y) == 9){
                minimumMove = minimumMove > move ? move : minimumMove;
            return minimumMove;
        }            
        current = generate(x,y,x-1,y);
          if(x > 0 && (!covered.containsKey(current) || current.)))
              findDistance(r,c,x-1,y,area,move++);
         if(x < r - 1)
             findDistance(r,c,x+1,y,area,move++);
          if(y > 0)
              findDistance(r,c,x,y-1,area,move++);
         if(y < c - 1)
             findDistance(r,c,x,y+1,area,move++);
        return -1;   
    }
    
    public static String generate(int cx,int cy, int px, int py){
        return "" + cx + "|" + cy + "|" + px + "|" + py;

    // METHOD SIGNATURE ENDS
}
