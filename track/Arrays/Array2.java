import java.util.Scanner;
class Array2
{
    public static void main(String[] args)
    {
        int[] a=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i=a.length-1;i>=0;i--)
        {
            a[i]=sc.nextInt();
        }
        for(int j=a.length-1;j>=0;j--)
        {
            System.out.println(a[j]);   
        }


    }
}