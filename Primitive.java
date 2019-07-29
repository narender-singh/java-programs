class Primitive{
    public static void main(String... a){
        m1();
    }

    public static int i = 0;

    public static void m1(){
        synchronized(i){
            System.out.println("synchornized on primitive type");
        }
    }
}
