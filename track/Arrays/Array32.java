class Array32
{
    public static void main(String[] args)
    {
    // write a program to add element to an array//10,20,30,40 //b={10,20,30,40,50}
        int a[]={10,20,30,40};
        int b[]=new int[a.length+1];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i]  ;   
       }
       b[b.length-1]=90;
       for(int x:b)
       {
        System.out.print(x+" ");
       }
    }
}