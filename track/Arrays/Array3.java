import java.util.Scanner;
class Array3{
    public static void main(String[] args)
    {
        int []a =new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter array elements are: ");
        for(int i=0;i<=a.length-1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("array elements are: ");
        for(int j=0;j<=a.length-1;j++)
        {
            System.out.println(a[j]);
        }
        sc.close();
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("Total:"+sum);
        

        

    }
}