class Main2
{
    public static void main(String[] args)
    {
        Mobile m=new Mobile();
        Charger c=new Charger();
        m.methodMobile(c);
        m.o.checkOs();

    }
}
class Os{
    Os()
    {
        System.out.println("I am os constructor");
    }
    void checkOs()
    {
        System.out.println("Checking OS");
    }
}
class Mobile
{
    OS o=new Os();
    Mobile()
    {
        System.out.println("I am mobile constructor");
    }
    void methodMobile(Charger c)
    {
        System.out.println("method of mobile");
       
    }
}
class Charger
{
    Charger()
    {
        System.out.println("Charger constructor");
    }
    void chareMethod()
    {
        System.out.println("method of charger");
    }
}