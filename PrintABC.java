import java.util.concurrent.*;

class PrintABC{
        public static final Object o1 = new Object();
        public static final Object o2 = new Object();
        public static final CountDownLatch latch = new CountDownLatch(3);
        public static void main(String... args) throws InterruptedException{
        Thread t1 = new Thread( new Runnable(){ public void run()  { try{ synchronized(o1){ latch.await();  System.out.println("A"); o1.notify();  } } catch(Exception e) { } }});
            
            Thread t2 = new Thread(new Runnable(){ public void run(){ try { synchronized(o1){ latch.await(); o1.wait(); System.out.println("B"); o2.notify(); }}catch(Exception e){}}});
            Thread t3 = new Thread(new Runnable(){ public void run(){ try { synchronized(o1){ latch.await(); o2.wait(); System.out.println("C"); } }catch(Exception e){} }});
            t1.start();
            t2.start();
            t3.start();
            Thread.sleep(5000000);
                   
    }
}
