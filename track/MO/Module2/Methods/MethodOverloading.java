class MethodOverloading{
    int add(int a,int b)
    {
        return a+b;
    }
    int add(int a,int b,int c)
    {
        return a+b+c;
    }
    int add(double a,double b)
    {
        return a+b;
    }
     public static void main(String[] args)
     {
        MethodOverloading m=new MethodOverloading();
        System.out.println(m.add(10,20));
        System.out.println(m.add(10,20,30));
        System.out.println(m.add(10.5,20.5));
     }
    
}