Public class Program1-1{
    public static void main(String[] args)

    {
            student s1=new Student();
            s1.roll=12;
            s1.name="Raja";
            s1.height=165.5;
            System.out.println(s1.roll);
            System.out.println(s1.name);
            System.out.println(s1.height);
            s1.run();
            s1.sleep(); 
    }
}