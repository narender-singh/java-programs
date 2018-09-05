public class Try{

    public static int doWork(){
        try{
            System.out.println("i am done");
            return 0;
        } catch(Exception e) {
            System.out.println("Exception occurred" + e);
            return 1;
        }
        finally{
        System.out.println("Still doing");        
        }
    }

    public static void main(String... args)
    {
        System.out.println("Result : " + doWork());
    }
}
