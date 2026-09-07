import java.util.Scanner;
class Arrays19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();  
        int sum=0;
        for(int i=0;i<size;i++)
        {
            sum+=sc.nextInt();
        }
        System.out.print(sum+" ");
        double avg=(double)sum/size;
        System.out.printf("%.2f\n",avg);
        }
}
