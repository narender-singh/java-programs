class EvenOdd{
    
    public static Object lock = new Object();

    public static void main(String... a) throws InterruptedException {
        Thread odd = new Thread(new Odd());
        Thread even = new Thread(new Even());
        even.start();
        odd.start();
        even.join();
        odd.join();
    }

    static class Even implements Runnable{
    
        public void run(){
                int i = 2;
                synchronized(lock){
                try{
                    while(i < 11){
                        lock.wait();
                        System.out.println(i);
                        i += 2;
                        lock.notify();
                    }
                    lock.notify();
                }
                catch(InterruptedException e){

                }
            }
        }
    }

    static class Odd implements Runnable{
        public void run(){
            int i = 1;
            synchronized(lock){
                try{
                    while(i < 11){
                        System.out.println(i);
                        i+= 2;
                        lock.notify();
                        lock.wait();
                    }
                    lock.notify();
                }catch(InterruptedException e){
                }
            }
        }
    }
}
