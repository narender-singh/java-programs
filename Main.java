class Main
{
    public Main(int i){
    }
    public static void mainq(String... args) throws Exception
    {
        NestedClasses cls = new NestedClasses();
        NestedClasses.InnerStaticClass.print();
        try{
            throw new Error();
        }
        catch(Exception e){
            System.out.println("A");
        }
        finally{
            System.out.println("D");
        }
    }
}
