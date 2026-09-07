import java.util.Scanner;
class Arrays13{
    public static void main(String[] args)
    {
        int a[][]=new int [3][5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array elements are:");
        for(int i=0;i<3;i++)//for(int i=0;i<a.length;i++)//a.length gives rows length in multi dimensional array

        {
           for(int j=0;j<5;j++)//for(int j=0;j<a[i].length;j++ )//a[i].length gives col length  
           {
              a[i][j]=sc.nextInt();
          
            } 
        }
        
        for(int i=0;i<3;i++)

        {
           for(j=0;j<5;j++)
           {
             System.out.print( a[i][j]);
          
            } 
            System.out.println();
        }

    }

}