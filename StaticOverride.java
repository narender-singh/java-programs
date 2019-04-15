class Static{
    public static void printer(){
        System.out.println("Static Printer");
    }
}

public class StaticOverride extends Static{
    public void printer(){
        System.out.println("Static Override Printer");
    }

    public static void main(String[] args){
        Static obj = new StaticOverride();
        obj.printer();
    }
}
