import java.util.Scanner;
class Arrays4{
    public static void main(String[] args)
    {
        int a[] =new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elemnts are:");
        for(int i-0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        int max=a[0];
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }  
        }
        System.out.println("Maximum element is:"+max);
    }
}