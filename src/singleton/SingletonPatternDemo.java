package singleton;

public class SingletonPatternDemo
{
    public static void main(String[] args)
    {
        Multithread treath1 = new Multithread("first");
        treath1.start();
        
        Multithread treath2 = new Multithread("second");
        treath2.start();
        
        treath2.run();
        treath1.run();
        
        treath2.close();
        treath1.close();
    }
}
