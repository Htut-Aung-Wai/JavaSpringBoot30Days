//abstract

abstract class D3_abstract_interface {
   public abstract void AbstractClass();
   public void Output(){

       System.out.println("This is concret abstract class");
    }
}
//interface
interface D3_interface{

    public void InterfaceUsed();
    public default void InterfaceDefaultMethod(){

        System.out.println("This is interface default method");
    }


}

class AbstractUsuageClass extends D3_abstract_interface{

    public void AbstractClass()
    {
        System.out.println("This is Abstract Class used");
    }
}

class InterfaceUsuageClass implements D3_interface{
    public void InterfaceUsed()
    {
        System.out.println("Interface class is used");
    }
}

class AbstractMain
{
    public static void main (String [] args)
    {
            AbstractUsuageClass abstractUsed=new AbstractUsuageClass();
            abstractUsed.AbstractClass();
            abstractUsed.Output();
            InterfaceUsuageClass interfaceUsed=new InterfaceUsuageClass();
            interfaceUsed.InterfaceUsed();
            interfaceUsed.InterfaceDefaultMethod();


    }
}