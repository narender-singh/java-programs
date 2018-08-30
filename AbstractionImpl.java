public class AbstractionImpl extends Abstraction{

    public static void main(String... args){
        Object o = new AbstractionImpl();
        Abstraction a = (Abstraction) o;
        a.call();
    }

    public void called(Abstraction o){
        Abstraction a = o;
        a.call();
    }

    public void call(){
    System.out.println("Called");
    }

}
