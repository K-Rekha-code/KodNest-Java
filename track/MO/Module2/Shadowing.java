 public class Shadowing{
    Public static void main(String args[]){
    Student s1=new Studen();
    
    s1.input("Raja",18,5.5);
   
    s1.display();
}
}
class Student{
    String name;
    int age;
    double height;
    void input(String name,int age,double height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    void display(){
        System.out.println(name+" "+age+" "+height);
    }   
}