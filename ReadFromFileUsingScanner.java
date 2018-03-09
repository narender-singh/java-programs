// Java Program to illustrate reading from Text File
// using Scanner Class
import java.io.*;
import java.util.*;
class ReadFromFileUsingScanner
{
    public static void main(String[] args) throws Exception
    {
        // pass the path to the file as a parameter
        File file = new File("input.in");
        Scanner ob = new Scanner(file);
        PrintWriter writer = new PrintWriter("output.out", "UTF-8");  // output text file

        int t=ob.nextInt();
        for(int ii=1;ii<=t;ii++)
        {
            int n=ob.nextInt();
            int a[]=new int[5001];
            for(int i=0;i<5001;i++)
                a[i]=0;
            for(int i=1;i<=n;i++)
            {
                int a1=ob.nextInt();
                int a2=ob.nextInt();
                for(int j=a1;j<=a2;j++)
                {
                    a[j]++;
                }
            }
            n=ob.nextInt();
            writer.print("Case #"+ii+":");
            for(int i=1;i<=n;i++)
            {
                int a1=ob.nextInt();
                writer.print(" "+a[a1]);
            }
            writer.println();
        }
        writer.close();
    }
}
