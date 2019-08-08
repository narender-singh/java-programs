import java.io.*;
class A{
    public void say() throws IOException{
        System.out.println("A");
    }
}

class B extends A{
    public void say(){
        System.out.println("B");
    }
}

public class Private {
    public static void main(String... args) {
        B a = new B();
        A b = new A();
        a.say();
        b.say();
    }
}
