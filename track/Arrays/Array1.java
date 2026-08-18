import java.util.Scanner;
class Array1{
    public static void main(String[] args){
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=a.length-1;i++)
        { 
            a[i]=scanner.nextInt();
        }
        for(int j=1;j<=a.length-1;j++)
        { 
            System.out.println(a[j]);
        }

        
    }
}   