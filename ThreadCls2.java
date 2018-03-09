class ThreadCls2
{
    public synchronized void Function1()
    {
        for( int i = 0; i< 1000; i++)
        {
            System.out.println(" In Function 1 of ThreadCls2: " + Thread.currentThread().getName());
            try{
                System.out.println("wait completed");
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted Function 1 exiting....");
               return;
            }
        }
    }
}

