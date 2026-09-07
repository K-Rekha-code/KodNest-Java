import java.util.Scanner;
class Arrays14{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][];
        a[0]=new int[5];
        a[1]=new int[3];
        a[2]=new int[4];
        for(int i=0;i<=a.length-1;i++)//a.length gives no.of row in 2d arrays
        {
                for(int j=0;j<=a[i].length-1;j++) //a[i].length gives no.of col in row i which means 0,1,2 rows
            {
                 a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<=a.length-1;i++)
        {
            for(int j=0;j<=a[i].length-1;j++)
            {
                System.out.print( a[i][j]+" ");  
            }
            System.out.println();
        }
    }
}