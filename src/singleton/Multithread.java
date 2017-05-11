package singleton;

import static singleton.SingleObject.getInstance;


public class Multithread extends Thread
{
    private Thread thread;
    private String threadName;
    private SingleObject theSingleOne;

    public Multithread(String treathName)
    {
        this.threadName = treathName;
        System.out.println(this.threadName + " created.");
    }

    public void run()
    {
        System.out.println("Running " + threadName + " thread.");
        if(theSingleOne == null)
        {
            theSingleOne = getInstance();
            System.out.println(threadName + " thread, has a an instance of SingleObject," +
                    "this is its hash code:" + theSingleOne.hashCode());
        }
    }

    public void start()
    {
        System.out.println("Starting " + threadName + " thread.");
        if(thread == null)
        {
            thread = new Thread(this, threadName);
            thread.start();
        }

    }

    public void close()
    {
        System.out.println("Stopping " + threadName + " thread.");
        thread.stop();
    }
}
