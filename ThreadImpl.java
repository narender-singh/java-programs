class ThreadImpl
{
    public static void main(String... args) throws InterruptedException
    {
        ThreadCls2 c = new ThreadCls2();
        Thread t = new Thread(new Runnable(){
            public void run()
            {
                c.Function1();
            }
        });
        t.setDaemon(true);
        t.start();
        Thread.sleep(3000);
        (new ThreadCls()).Function1();
        t.join(10000);
        System.out.println("Completed");
    }
}
