class Array35
{
    public static void main(String[] args)
    {
        int a[]={10,20,30,40};
        int b=40;
        for(int i=a.length-1;i>0;i--)
        {
            a[i]=a[i-1];
            
        }
        a[0]=b;   
         for(int x:a)
    
        {
            System.out.print(x+" ");
        }   
    }
}