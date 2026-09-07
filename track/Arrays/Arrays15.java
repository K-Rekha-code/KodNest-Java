import java.util.Scanner;
class Arrays15{
    public static void main(String[] args)
    {
        int a[][][]=new int[3][4][5];
        Scanner sc=new Scanner();
        for(int i=0;i<a.length;i++) //here i represnts which block like 0,1,2
        {
            for(int j=0;j<a[i].length;j++) //here j represnts which row in that block like 0,1,2,3
            {
                for(int k=0;k<a[i][j].length;k++) //here k represents which coloumn in that row like 0,1,2,3,4
                {
                    a[i][j][k]=sc.nextInt();
                }
            }
        }
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                for(int k=0;k<a[i][j].length;k++)
                {
                    System.out.print(a[i][j][k]+" ");//print is used to print in the same line of a single row
                }
                System.out.println();//it goes to the new line after completing to the new linr so every row in different line
            }
            System.out.println();//it goes to the new line which is blank to give the space for every block
        }      
    }
}