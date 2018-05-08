import java.io.FileNotFoundException;
import java.io.IOException;

public class Throws
{
    public static void main(String[] args) throws IOException
    {
        printHello();
    }

    public static void printHello() throws NullPointerException, FileNotFoundException
    {
        System.out.println("Func Throwing Null Pointer Exception");
    }
}
