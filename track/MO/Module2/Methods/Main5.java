class MethodOverloading{
 int add(int a,int b){
    return a+b;
  }
 int add(short a,short b){
    return a+b+c;
  }
   
}
class Main5{
    Public static void main(String args[])
    {
        MethodOverloading m1= new MethodOverLoading(); 
        int a=m1.add(10,20);
        System.out.println(a);

    }
}