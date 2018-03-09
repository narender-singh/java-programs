class ThreadCls
{
    public synchronized void Function1()
    {
        for( int i = 0; i< 10; i++)
        {
            System.out.println(" In Function 1 : " + Thread.currentThread().getName());
            try{
                Thread.sleep(4000);
                notifyAll();
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted Function 1 exiting....");
               return;
            }
        }
    }

    public synchronized void Function2()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(" In Function 2 : " + Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted existing....");
                return;
            }
        }
    }

}

