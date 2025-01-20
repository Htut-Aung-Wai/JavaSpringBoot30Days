public class D3 {
private String encapsulate ="Hi,this is Poly";
public void setEncapsulate(String encapsulate)
{

    this.encapsulate = encapsulate;
}

public String getEncapsulate()
{
    return this.encapsulate;
}

public void hello()
{

    System.out.println("Hello");

}

public void InherritanceMethod()
{
    System.out.println("Inherritance is used");
}


}

class Poly extends D3{

    @Override
    public void hello()
     {
         System.out.println("This is poly ,Hello!");
     }


}

class D3Main {

    public static void main(String [] args)
    {
        D3 poly=new Poly();
        poly.hello();
        Poly inherri=new Poly();
        inherri.InherritanceMethod();
        inherri.setEncapsulate("Hi this is encapsulate");
        System.out.println(inherri.getEncapsulate());
    }
}


