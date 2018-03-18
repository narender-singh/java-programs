class SyncOnNullReference
{
    private Object o;

    public void NullSyncMethod()
    {
        synchronized(o)
        {
            System.out.println("it Worked !! nice !!");
        }
    }

    public static void main(String... args)
    {
        SyncOnNullReference nullSync = new SyncOnNullReference();
        nullSync.NullSyncMethod();
    }
}
