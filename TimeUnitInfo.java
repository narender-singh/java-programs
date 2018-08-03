import java.util.concurrent.TimeUnit;

public class TimeUnitInfo{

    public static void main(String[] args){
    long value = TimeUnit.MILLISECONDS.convert(TimeUnit.HOURS.toNanos(8),TimeUnit.NANOSECONDS);
    System.out.println("Time in millis" + System.currentTimeMillis());
    System.out.println(System.currentTimeMillis() + value); 
    }
}
