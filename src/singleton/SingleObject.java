package singleton;

public class SingleObject
{
    private static SingleObject theSingleOne;

    private SingleObject(){}

    public static SingleObject getInstance()
    {
        if(theSingleOne == null)
        {
            synchronized (SingleObject.class)
            {
               if(theSingleOne == null)
               {
                   theSingleOne  = new SingleObject();
               }
            }
        }
        return theSingleOne;
    }
}
